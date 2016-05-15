package test;

import deltagare.Kursdeltagare;

public class KursdeltagareTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen Kursdeltagare:");
		Kursdeltagare student1 = new Kursdeltagare("abc123");
		Kursdeltagare student2 = new Kursdeltagare("def457");
		String deltagare1 = student1.getStudentid();
		String deltagare2 = student2.getStudentid();
		
		if(deltagare1.equals("abc123") && deltagare2.equals("def457")){
			System.out.println("Kursdeltagare skrivs in korrekt.");
		} else {
			System.err.println("Kursdeltagare skrivs inte in korrekt.");
		}
		
		System.out.println("Testet för klassen kursdeltagare är slutfört.");

	}
	
}
