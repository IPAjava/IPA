package systemstart;

import java.util.ArrayList;

import deltagare.*;
import kurser.*;

public class Main {

	public static void main(String[] args) {
		
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
			
			for (Moment meme : momentlista) {
				System.out.println(meme.getMomentNamn() + " " + meme.getMomentid());
				ArrayList<Momentdeltagare> momentdeltagare = new ArrayList<>();
				momentdeltagare = meme.getMomentdeltagare();
				
				for (Momentdeltagare momdel : momentdeltagare) {
					System.out.println(momdel.getStudentid() + " " + meme.getMomentid());
				}
			}
			
			
			
		}
		
		
		
	
	}

}
