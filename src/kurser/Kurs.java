package kurser;

import java.util.ArrayList;
import java.util.Scanner;

import deltagare.Kursdeltagare;

public class Kurs {
	
	private String namn;
	private String kursid;
	private ArrayList<Moment> momentlista;
	private ArrayList<Kursdeltagare> deltagarlista;
	private Kurslista kurslista;
	
	public Kurs(String namn, String kursid) {
		this.namn = namn;
		this.kursid = kursid;
		momentlista = new ArrayList<>();
		deltagarlista = new ArrayList<>();
	}
	
	public void addMoment(String namn, String momentid) {
		Moment nyttMoment = new Moment(namn, momentid, deltagarlista);
		momentlista.add(nyttMoment);
	}
	
	public void addDeltagare(String studentid) {
		Kursdeltagare nyKursdeltagare = new Kursdeltagare(studentid);
		deltagarlista.add(nyKursdeltagare);
	}
	
	public String getKursid() {
		return kursid;
	}
	
	public String getKursnamn() {
		return namn;
	}
	
	public ArrayList<Moment> getMomentlista() {
		return momentlista;
	}
	
	public ArrayList<Kursdeltagare> getDeltagarlista() {
		return deltagarlista;
	}
	
	public void initMomentdeltagare() {
		for (Moment m : momentlista) {
			m.addMomentdeltagare();
		}
	}
	
	public void sysCommand(String input){
		if(input.equals("EXIT")){
			System.out.println("Progammet avslutas...");
			System.exit(0);
		} else if(input.equals("HEM")){
			kurslista.print();
		}
	}
	
	public void print(Kurslista kurslista){
		this.kurslista = kurslista;
		boolean existMoment = false;
		int currentMoment = 0;
		System.out.println("Du har gått in på kursen " + kursid + " " + namn + ".\nVälj moment genom att skriva momentkoden.\n");
		for (int i = 0; i < momentlista.size(); i++) {
			System.out.println(momentlista.get(i).getMomentid() + " - " + momentlista.get(i).getMomentNamn());
		}
		
		Scanner kbinput = new Scanner(System.in);
		while(!existMoment){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < momentlista.size(); i++) {
				if(input.equals(momentlista.get(i).getMomentid())){
					existMoment = true;
					currentMoment = i;
				}
			}
			if(existMoment == true){
				momentlista.get(currentMoment).print(kurslista);
			} else {
				System.out.println("Momentkoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}

}
