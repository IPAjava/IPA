package test;

import deltagare.Momentdeltagare;

public class MomentdeltagareTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen Momentdeltagare:");
		Momentdeltagare md1 = new Momentdeltagare("T1", "abc123");
		Momentdeltagare md2 = new Momentdeltagare("T2", "def457");
		String md1id = md1.getStudentid();
		String md2id = md2.getStudentid();
		String moment1id = md1.getMomentid();
		String moment2id = md2.getMomentid();
		
		if(md1id.equals("abc123") && md2id.equals("def457")){
			System.out.println("Momentdeltagarnas id skrivs in korrekt.");
		} else {
			System.err.println("Momentdeltagarnas id skrivs inte in korrekt.");
		}
		
		if(moment1id.equals("T1") && moment2id.equals("T2")){
			System.out.println("Momentens id skrivs in korrekt.");
		} else {
			System.err.println("Momentens id skrivs inte in korrekt.");
		}
		
		System.out.println("Testet för klassen Momentdeltagare är slutfört.");
	}
	
}
