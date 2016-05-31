package deltagare;

import java.util.ArrayList;

import betyg.Betygsadapter;
import kurser.Kurs;

public class Examinationsplats {

	private Kursdeltagare kursdeltagare;
	private Kurs kurs;
	private ArrayList<Betygsadapter> momentBetyg;
	private int antalBetyg;
	private int antalMoment;
	private Betygsadapter slutbetyg;

	public Examinationsplats(Kursdeltagare kursdeltagare, Kurs kurs) {
		this.kursdeltagare = kursdeltagare;
		this.kurs = kurs;
		momentBetyg = new ArrayList<>();
		antalBetyg = 0;
		antalMoment = kurs.getMomentlista().size();

	}

	public void addBetyg(Betygsadapter betyg) {


		momentBetyg.add(betyg);
		antalBetyg++;


		if(antalBetyg == antalMoment) {

			if (kursdeltagare.getFakultet().equals("filfak")) {
				slutbetyg = kurs.setSlutbetygFilfak(momentBetyg);
			}

			else 
				slutbetyg = kurs.setSlutbetygTekfak(momentBetyg);

			System.out.println("Slutbetyget för student "+kursdeltagare.getStudentid()+
					" i kursen "+kurs.getKursid()+" blev: "+slutbetyg.getBetyg()+ " har skickats till LADOK");
		}



	}




}
