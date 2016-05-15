package kurser;

import java.util.ArrayList;
import java.util.Scanner;

public class Kurslista {

	private ArrayList<Kurs> kurslista;

	public Kurslista() {
		kurslista = new ArrayList<>();
	}

	public void addKurs(String namn, String kursid) {
		Kurs nyKurs = new Kurs(namn, kursid);
		kurslista.add(nyKurs);
	}

	public ArrayList<Kurs> getKurslista() {
		return kurslista;
	}

	public void init() {
		addKurs("Databaser", "725G51");
		kurslista.get(0).addDeltagare("jonbo190");
		kurslista.get(0).addDeltagare("simjo640");
		kurslista.get(0).addDeltagare("ludke892");
		kurslista.get(0).addDeltagare("jonsm761");

		kurslista.get(0).addMoment("Laboration", "Uppgift 1");
		kurslista.get(0).addMoment("Hemtenta", "TENT");

		kurslista.get(0).initMomentdeltagare();

	}
	
	public void sysCommand(String input){
		if(input.equals("EXIT")){
			System.out.println("Progammet avslutas...");
			System.exit(0);
		} else if(input.equals("HEM")){
			print();
		}
	}

	public void print() {
		boolean existKurs = false;
		int currentKurs = 0;
		System.out.println("Välkommen till IPA. Du är inloggad som Kursansvarig.");
		System.out.println("(Du kan alltid komma till startsidan om du skriver \"HEM\" eller avsluta programmet genom att skriva \"EXIT\".)\nVälj kurs genom att skriva kurskoden.\n");
		for (int i = 0; i < kurslista.size(); i++) {
			System.out.println(kurslista.get(i).getKursid() + " " + kurslista.get(i).getKursnamn());
		}

		Scanner kbinput = new Scanner(System.in);
		while(!existKurs){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < kurslista.size(); i++) {
				if(input.equals(kurslista.get(i).getKursid())){
					existKurs = true;
					currentKurs = i;
				}
			}
			if(existKurs == true){
				kurslista.get(currentKurs).print(this);
			} else {
				System.out.println("Kurskoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}
}

