package systemstart;

import deltagare.Kursdeltagare;
import deltagare.Momentdeltagare;
import kurser.Kurs;
import kurser.Kurslista;
import kurser.Moment;

public class Initiera {
	
	private Kurslista kurslista;
	
	public Initiera(){
		this.kurslista = new Kurslista();
	}
	
	public void init() {
		Kurs kurs1 = new Kurs("Databaser", "725G51");
		
		kurslista.addKurs(kurs1);
		Kursdeltagare kursdeltagare1 = new Kursdeltagare("jonbo190");
		Kursdeltagare kursdeltagare2 = new Kursdeltagare("simjo640");
		Kursdeltagare kursdeltagare3 = new Kursdeltagare("ludke892");
		Kursdeltagare kursdeltagare4 = new Kursdeltagare("jonsm761");
		
		kurs1.addDeltagare(kursdeltagare1);
		kurs1.addDeltagare(kursdeltagare2);
		kurs1.addDeltagare(kursdeltagare3);
		kurs1.addDeltagare(kursdeltagare4);
		
		Moment moment1 = new Moment("Laboration", "Uppgift 1");
		Moment moment2 = new Moment("Hemtenta", "TENT");
		kurs1.addMoment(moment1);
		kurs1.addMoment(moment2);
		
		Momentdeltagare momentdeltagare1 = new Momentdeltagare("Uppgift 1", "jonbo190");
		Momentdeltagare momentdeltagare2 = new Momentdeltagare("Uppgift 1", "simjo640");
		Momentdeltagare momentdeltagare3 = new Momentdeltagare("Uppgift 1", "ludke892");
		Momentdeltagare momentdeltagare4 = new Momentdeltagare("Uppgift 1", "jonsm761");
		
		Momentdeltagare momentdeltagare5 = new Momentdeltagare("TENT", "jonbo190");
		Momentdeltagare momentdeltagare6 = new Momentdeltagare("TENT", "simjo640");
		Momentdeltagare momentdeltagare7 = new Momentdeltagare("TENT", "ludke892");
		Momentdeltagare momentdeltagare8 = new Momentdeltagare("TENT", "jonsm761");
		
		moment1.addMomentdeltagare(momentdeltagare1);
		moment1.addMomentdeltagare(momentdeltagare2);
		moment1.addMomentdeltagare(momentdeltagare3);
		moment1.addMomentdeltagare(momentdeltagare4);
		
		moment2.addMomentdeltagare(momentdeltagare5);
		moment2.addMomentdeltagare(momentdeltagare6);
		moment2.addMomentdeltagare(momentdeltagare7);
		moment2.addMomentdeltagare(momentdeltagare8);
		
		System.out.println(kurslista.getKurslista().get(0).getKursnamn());
		
		Kontrollant kontrollant = new Kontrollant(kurslista);
		kontrollant.utskriftKurslista();
	}
}
