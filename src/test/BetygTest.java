package test;

import deltagare.Betyg;

public class BetygTest {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen betyg:");
		Betyg b1 = new Betyg("G");
		Betyg b2 = new Betyg("VG");
		String betyg1 = b1.getBetyg();
		String betyg2 = b2.getBetyg();
		
		if(betyg1.equals("G") && betyg2.equals("VG")){
			System.out.println("Betyg skrivs in korrekt.");
		} else {
			System.err.println("Betyg skrivs inte in korrekt.");
		}
		
		b1.updateBetyg("VG");
		b2.updateBetyg("G");
		betyg1 = b1.getBetyg();
		betyg2 = b2.getBetyg();
		
		if(betyg1.equals("VG") && betyg2.equals("G")){
			System.out.println("Betyg uppdateras korrekt.");
		} else {
			System.err.println("Betyg uppdateras inte korrekt.");
		}
		
		System.out.println("Testet för klassen betyg är slutfört.");
	}
	
}
