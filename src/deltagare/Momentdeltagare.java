package deltagare;

import java.util.Scanner;

import kurser.Kurslista;
import kurser.Moment;

public class Momentdeltagare {

	private String momentid;
	private String studentid;
	private Betyg betyg;
	private boolean betygFinns;
	private boolean lockedBetyg = false;
	private Kurslista kurslista;
	private Moment moment;
	
	public Momentdeltagare(String momentid, String studentid) {
		this.momentid = momentid;
		this.studentid = studentid;
		this.betygFinns = false;
	}

	public void addBetyg(String betyg) {
		this.betyg = new Betyg(betyg);
		this.betygFinns = true;
		System.out.println("Du gav betyget " + betyg + " till studenten " + studentid + " för moment " + momentid  + ".");
		print(kurslista, moment);
	}

	public void changeBetyg(String betyg) {
		this.betyg.updateBetyg(betyg);
		System.out.println("Du ändrade betyget till " + betyg + " för studenten " + studentid + " i moment " + momentid  + ".");
		print(kurslista, moment);
	}

	public String getMomentid() {
		return momentid;
	}

	public String getStudentid() {
		return studentid;
	}

	public String getBetyg() {
		return this.betyg.getBetyg();
	}

	public void sendLadok(){
		lockedBetyg = true;
		System.out.println("Betyget har skickats till Ladok för rapportering.");
		print(kurslista, moment);
	}
	
	public void sysCommand(String input){
		if(input.equals("EXIT")){
			System.out.println("Progammet avslutas...");
			System.exit(0);
		} else if(input.equals("HEM")){
			kurslista.print();
		} else if(input.equals("BACK")){
			moment.print(kurslista);
		}
	}

	public void print(Kurslista kurslista, Moment moment){
		this.kurslista = kurslista;
		this.moment = moment;
		System.out.println("Du har valt studenten " + studentid + " för momentet " + momentid + ".");
		System.out.println("Skriv \"BACK\" för att återgå till listan över deltagare.");
		if(lockedBetyg == true){
			System.out.println("Rapporterat betyg till Ladok: " + getBetyg() + ".");
			System.out.println("Återgå genom att skriva \"HEM\" eller avsluta genom att skriva \"EXIT\"");
			Scanner kbinput = new Scanner(System.in);
			boolean cont = false;
			while(!cont){
				String input = kbinput.nextLine();
				if(input.equals("EXIT") || input.equals("HEM")){
					sysCommand(input);
					cont = true;
				} else {
					System.out.println("Felaktigt kommando.\nFörsök igen:");
				}
				
			}
			kbinput.close();
		} else if (betygFinns == false){
			boolean existBetyg = false;
			System.out.println("Ge ett betyg för detta moment: (U/G/VG).");
			Scanner kbinput = new Scanner(System.in);
			while(!existBetyg){
				String input = kbinput.nextLine();
				sysCommand(input);
				if(input.equals("U") || input.equals("G") || input.equals("VG")){
					existBetyg = true;
					addBetyg(input);
				} else {
					System.out.println("Betyget du valt existerar inte. \nFörsök igen:");
				}
			}
			kbinput.close();
		} else {
			boolean oj = false;
			System.out.println("\nPreliminärt betyg: " + getBetyg() + ".");
			System.out.println("För att skicka betyg till LADOK, skriv \"LADOK\".");
			System.out.println("För att ändra betyg, skriv \"EDIT\".");
			Scanner kbinput = new Scanner(System.in);
			while(oj == false){
				String input = kbinput.nextLine();
				sysCommand(input);
				if(input.equals("LADOK")){
					oj = true;
					sendLadok();
					break;
				} else if(input.equals("EDIT")){
					oj = true;
					boolean existBetyg = false;
					System.out.println("Ändra betyg för detta moment: (U/G/VG).");
					Scanner sc = new Scanner(System.in);
					while(!existBetyg){
						String scinput = kbinput.nextLine();
						sysCommand(scinput);
						if(scinput.equals("U") || scinput.equals("G") || scinput.equals("VG")){
							existBetyg = true;
							changeBetyg(scinput);
						} else {
							System.out.println("Betyget du valt existerar inte. \nFörsök igen:");
						}
					}
					sc.close();
				} else {
					System.out.println("Det du angav existerar inte. \nFörsök igen:");
				}
			}
			kbinput.close();
		}

	}

}
