package systemstart;

import java.util.ArrayList;
import java.util.Scanner;

import deltagare.Kursdeltagare;
import deltagare.Momentdeltagare;
import kurser.*;

public class Kontrollant {
	
	private Kurslista kurslista;
	private Kurs currentCourse;
	private Moment currentMoment;
	private Momentdeltagare currentMomentdeltagare;
	
	public Kontrollant(Kurslista kurslista){
		this.kurslista = kurslista;
	}
	
	public void utskriftKurslista() {
		ArrayList<Kurs> availableCourses = new ArrayList<>();
		availableCourses = kurslista.getKurslista();
		boolean existKurs = false;
		System.out.println("Välkommen till IPA. Du är inloggad som Kursansvarig.");
		System.out.println("(Du kan alltid komma till startsidan om du skriver \"HEM\" eller avsluta programmet genom att skriva \"EXIT\".)\nVälj kurs genom att skriva kurskoden.\n");
		for (int i = 0; i < availableCourses.size(); i++) {
			System.out.println(availableCourses.get(i).getKursid() + " " + availableCourses.get(i).getKursnamn());
		}

		Scanner kbinput = new Scanner(System.in);
		while(!existKurs){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < availableCourses.size(); i++) {
				if(input.equals(availableCourses.get(i).getKursid())){
					existKurs = true;
					this.currentCourse = availableCourses.get(i);
				}
			}
			if(existKurs == true){
				utskriftKurs();
			} else {
				System.out.println("Kurskoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}
	
	public void utskriftKurs(){
		ArrayList <Moment> momentlista = new ArrayList<>();
		momentlista = currentCourse.getMomentlista();
		boolean existMoment = false;
		System.out.println("Du har gått in på kursen " + currentCourse.getKursid() + " " + currentCourse.getKursnamn() + ".\nVälj moment genom att skriva momentkoden.\n");
		for (int i = 0; i < momentlista.size(); i++) {
			System.out.println(momentlista.get(i).getMomentid() + " - " + momentlista.get(i).getMomentNamn());
		}
		Scanner kbinput = new Scanner(System.in);
		while(!existMoment){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < momentlista.size(); i++) {
				if(input.equals(momentlista.get(i).getMomentid())){
					existMoment = true;
					currentMoment = momentlista.get(i);
				}
			}
			if(existMoment == true){
				utskriftMoment();
			} else {
				System.out.println("Momentkoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}
	
	public void utskriftMoment(){
		ArrayList <Kursdeltagare> deltagarlista = new ArrayList<>();
		deltagarlista = currentCourse.getDeltagarlista();
		
		ArrayList <Momentdeltagare> momentdeltagare = new ArrayList<>();
		momentdeltagare = currentMoment.getMomentdeltagare();
		
		boolean existDeltagare = false;
		System.out.println("Du har gått in på moment " + currentMoment.getMomentid() + " " + currentMoment.getMomentNamn() + ".\nVälj kursdeltagare genom att skriva studentid.\n");
		for (int i = 0; i < deltagarlista.size(); i++) {
			System.out.println(deltagarlista.get(i).getStudentid());
		}
		Scanner kbinput = new Scanner(System.in);
		while(!existDeltagare){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < momentdeltagare.size(); i++) {
				if(input.equals(momentdeltagare.get(i).getStudentid())){
					existDeltagare = true;
					currentMomentdeltagare = momentdeltagare.get(i);
				}
			}
			if(existDeltagare == true){
				utskriftMomentdeltagare();
			} else {
				System.out.println("Momentkoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}
	
	public void utskriftMomentdeltagare(){
		System.out.println("Du har valt studenten " + currentMomentdeltagare.getStudentid() + " för momentet " + currentMomentdeltagare.getMomentid() + ".");
		System.out.println("Skriv \"BACK\" för att återgå till listan över deltagare.");
		if(currentMomentdeltagare.getLockedBetyg() == true){
			System.out.println("Återgå genom att skriva \"HEM\" eller avsluta genom att skriva \"EXIT\"");
			System.out.println("Rapporterat betyg till Ladok: " + currentMomentdeltagare.getBetyg() + ".");
			Scanner kbinput = new Scanner(System.in);
			boolean cont = false;
			while(!cont){
				String input = kbinput.nextLine();
				if(input.equals("EXIT") || input.equals("HEM") || input.equals("BACK")){
					sysCommandAlternative(input);
					cont = true;
				} else {
					System.out.println("Felaktigt kommando.\nFörsök igen:");
				}
				
			}
			kbinput.close();
		} else if (currentMomentdeltagare.getBetygFinns() == false){
			boolean existBetyg = false;
			System.out.println("Ge ett betyg för detta moment: (U/G/VG).");
			Scanner kbinput = new Scanner(System.in);
			while(!existBetyg){
				String input = kbinput.nextLine();
				sysCommandAlternative(input);
				if(input.equals("U") || input.equals("G") || input.equals("VG")){
					existBetyg = true;
					currentMomentdeltagare.addBetyg(input, this);
				} else {
					System.out.println("Betyget du valt existerar inte. \nFörsök igen:");
				}
			}
			kbinput.close();
		} else {
			boolean correctInput = false;
			System.out.println("\nPreliminärt betyg: " + currentMomentdeltagare.getBetyg() + ".");
			System.out.println("För att skicka betyg till LADOK, skriv \"LADOK\".");
			System.out.println("För att ändra betyg, skriv \"EDIT\".");
			Scanner kbinput = new Scanner(System.in);
			while(correctInput == false){
				String input = kbinput.nextLine();
				sysCommandAlternative(input);
				if(input.equals("LADOK")){
					correctInput = true;
					currentMomentdeltagare.sendLadok(this);
					break;
				} else if(input.equals("EDIT")){
					correctInput = true;
					boolean existBetyg = false;
					System.out.println("Ändra betyg för detta moment: (U/G/VG).");
					Scanner sc = new Scanner(System.in);
					while(!existBetyg){
						String scinput = kbinput.nextLine();
						sysCommandAlternative(scinput);
						if(scinput.equals("U") || scinput.equals("G") || scinput.equals("VG")){
							existBetyg = true;
							currentMomentdeltagare.changeBetyg(scinput, this);
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
	
	public void sysCommand(String input){
		if(input.equals("EXIT")){
			System.out.println("Progammet avslutas...");
			System.exit(0);
		} else if(input.equals("HEM")){
			utskriftKurslista();
		}
	}
	
	public void sysCommandAlternative(String input){
		if(input.equals("EXIT")){
			System.out.println("Progammet avslutas...");
			System.exit(0);
		} else if(input.equals("HEM")){
			utskriftKurslista();
		} else if(input.equals("BACK")){
			utskriftMoment();
		}
	}
	
	
}
