package kurser;

import java.util.ArrayList;

public class Kurslista {

	private ArrayList<Kurs> kurslista;
	
	public Kurslista() {
		kurslista = new ArrayList<>();
	}
	
	public void addKurs(String namn, String kursid) {
		Kurs nyKurs = new Kurs(namn, kursid);
		kurslista.add(nyKurs);
	}
	
	public void getKurs(String kursid) {
		
	}
	
	public ArrayList getKurslista() {
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

	}
}

