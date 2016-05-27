package test;

import java.util.ArrayList;

import deltagare.Kursdeltagare;
import deltagare.Momentdeltagare;
import kurser.Moment;

public class MomentTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen Moment:");
		ArrayList<Kursdeltagare> deltagarlista = new ArrayList<>();
		Kursdeltagare student1 = new Kursdeltagare("abc123");
		Kursdeltagare student2 = new Kursdeltagare("def457");
		deltagarlista.add(student1);
		deltagarlista.add(student2);
		
		
		
		Moment m1 = new Moment("Testmoment1", "T1");
		Moment m2 = new Moment("Testmoment2", "T2");
		String m1namn = m1.getMomentNamn();
		String m2namn = m2.getMomentNamn();
		String m1id = m1.getMomentid();
		String m2id = m2.getMomentid();
		
		if(m1namn.equals("Testmoment1") && m2namn.equals("Testmoment2")){
			System.out.println("Momentens namn skrivs in korrekt.");
		} else {
			System.err.println("Momentens namn skrivs inte in korrekt.");
		}
		
		if(m1id.equals("T1") && m2id.equals("T2")){
			System.out.println("Momentens id skrivs in korrekt.");
		} else {
			System.err.println("Momentens id skrivs inte in korrekt.");
		}
		
		Momentdeltagare momdel1 = new Momentdeltagare("Testmoment1", "abc123");
		Momentdeltagare momdel2 = new Momentdeltagare("Testmoment1", "def457");
		m1.addMomentdeltagare(momdel1);
		m1.addMomentdeltagare(momdel2);

		
		ArrayList<Momentdeltagare> testdeltagare = new ArrayList<>();
		testdeltagare = m1.getMomentdeltagare();
		
		if(testdeltagare.get(0).getStudentid().equals("abc123") && testdeltagare.get(1).getStudentid().equals("def457")){
			System.out.println("Momentens deltagare skrivs in korrekt.");
		} else {
			System.err.println("Momentens deltagare skrivs inte in korrekt.");
		}
		
		System.out.println("Testet för klassen Moment är slutfört.");
	}
	
}
