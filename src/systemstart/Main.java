package systemstart;

import java.util.ArrayList;

import deltagare.*;
import kurser.*;

public class Main {

	public static void main(String[] args) {
		testSoftware();

	}

	public static void testSoftware(){
		Kurslista test = new Kurslista();
		test.init();

		ArrayList<Kurs> kurser = new ArrayList<>();
		kurser = test.getKurslista();

		for (Kurs k : kurser) {
			System.out.println(k.getKursnamn() + " " + k.getKursid());
			ArrayList<Kursdeltagare> kursdeltagare = new ArrayList<>();
			kursdeltagare = k.getDeltagarlista();

			for (Kursdeltagare kuk : kursdeltagare) {
				System.out.println(kuk.getStudentid());
			}

			ArrayList<Moment> momentlista = new ArrayList<>();
			momentlista = k.getMomentlista();


			//moment.get(0).getmomentdeltgare(1).addbetyg("G")

			for (Moment meme : momentlista) {
				System.out.println(meme.getMomentNamn() + " " + meme.getMomentid());
				ArrayList<Momentdeltagare> momentdeltagare = new ArrayList<>();
				momentdeltagare = meme.getMomentdeltagare();
				if(meme.getMomentid() == "Uppgift 1"){
					momentdeltagare.get(0).addBetyg("G");
					momentdeltagare.get(1).addBetyg("G");
					momentdeltagare.get(2).addBetyg("G");
					momentdeltagare.get(3).addBetyg("G");

					momentdeltagare.get(0).changeBetyg("MANAGER");
				}else{
					momentdeltagare.get(0).addBetyg("U");
					momentdeltagare.get(1).addBetyg("U");
					momentdeltagare.get(2).addBetyg("U");
					momentdeltagare.get(3).addBetyg("U");
				}

				for (Momentdeltagare momdel : momentdeltagare) {
					//System.out.println(momdel.getStudentid() + " " + meme.getMomentid());
					System.out.println(momdel.getStudentid() + " " + momdel.getBetyg());
				}
			}



		}
	}





}
