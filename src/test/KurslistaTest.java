package test;

import java.util.ArrayList;

import kurser.Kurs;
import kurser.Kurslista;

public class KurslistaTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		System.out.println("Nu testas klassen Kurslista:");
		Kurslista kurslista = new Kurslista();
		Kurs kurs1 = new Kurs("Testkurs", "123T45");
		kurslista.addKurs(kurs1);
		ArrayList<Kurs> kurslist = new ArrayList<>();
		kurslist = kurslista.getKurslista();
		String kursnamn = kurslist.get(0).getKursnamn();
		String kursid = kurslist.get(0).getKursid();
		
		if(kursnamn.equals("Testkurs") && kursid.equals("123T45")){
			System.out.println("Testkurslistan skrivs in korrekt.");
		} else {
			System.err.println("Testkurslistan skrivs inte in korrekt.");
		}
		
		System.out.println("Testet för klassen Kurslista är slutfört.");
	}
}
