package test;

import java.util.ArrayList;

import deltagare.Kursdeltagare;
import kurser.Kurs;
import kurser.Moment;

public class KursTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen Kurs:");
		Kurs testkurs = new Kurs("Testkurs", "123T45");
		String testnamn = testkurs.getKursnamn();
		String testid = testkurs.getKursid();
		if(testnamn.equals("Testkurs") && testid.equals("123T45")){
			System.out.println("Testkursens namn och id skrivs in korrekt.");
		} else {
			System.err.println("Testkursens namn och id skrivs inte in korrekt.");
		}
		
		testkurs.addDeltagare("abc123");
		testkurs.addMoment("Testtent", "T1");
		ArrayList<Kursdeltagare> dellist = new ArrayList<>();
		dellist = testkurs.getDeltagarlista();
		String deltagare = dellist.get(0).getStudentid();
		if(deltagare.equals("abc123")){
			System.out.println("Testkursens deltagare skrivs in korrekt.");
		} else {
			System.err.println("Testkursens deltagare skrivs inte in korrekt.");
		}
		
		ArrayList<Moment> momlist = new ArrayList<>();
		momlist = testkurs.getMomentlista();
		String momentid = momlist.get(0).getMomentid();
		String momentnamn = momlist.get(0).getMomentNamn();
		if(momentid.equals("T1") && momentnamn.equals("Testtent")){
			System.out.println("Testkursens moment skrivs in korrekt.");
		} else {
			System.err.println("Testkursens moment skrivs inte in korrekt.");
		}
		
		System.out.println("Testet för klassen Kurs är slutfört.");
	}
	
}
