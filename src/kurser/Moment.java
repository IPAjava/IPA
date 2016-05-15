package kurser;

import java.util.ArrayList;
import java.util.Scanner;

import deltagare.Kursdeltagare;
import deltagare.Momentdeltagare;

public class Moment {

	private String namn;
	private String momentid;
	private ArrayList<Kursdeltagare> deltagarlista;
	private ArrayList<Momentdeltagare> momentdeltagare;
	private Kurslista kurslista;
	
	public Moment(String namn, String momentid, ArrayList<Kursdeltagare> deltagarlista) {
		this.namn = namn;
		this.momentid = momentid;
		this.deltagarlista = new ArrayList<>();
		this.deltagarlista = deltagarlista;
		momentdeltagare = new ArrayList<>();
	}
	
	public ArrayList<Momentdeltagare> getMomentdeltagare() {
		return momentdeltagare;
	}
	
	public String getMomentNamn() {
		return namn;
	}
	
	public String getMomentid() {
		return momentid;
	}
	
	public void addMomentdeltagare() {
		for (Kursdeltagare k : deltagarlista) {
			Momentdeltagare m = new Momentdeltagare(momentid, k.getStudentid());
			momentdeltagare.add(m);
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
		boolean existDeltagare = false;
		int currentDeltagare = 0;
		System.out.println("Du har gått in på moment " + momentid + " " + namn + ".\nVälj kursdeltagare genom att skriva studentid.\n");
		for (int i = 0; i < deltagarlista.size(); i++) {
			System.out.println(deltagarlista.get(i).getStudentid());
		}
		Scanner kbinput = new Scanner(System.in);
		while(!existDeltagare){
			String input = kbinput.nextLine();
			sysCommand(input);
			for (int i = 0; i < momentdeltagare.size(); i++) {
				if(input.equals(momentdeltagare.get(i).getStudentid())){
					existDeltagare = true;
					currentDeltagare = i;
				}
			}
			if(existDeltagare == true){
				momentdeltagare.get(currentDeltagare).print(kurslista, this);
			} else {
				System.out.println("Momentkoden du valt existerar inte. \nFörsök igen:");
			}
		}
		kbinput.close();
	}
}
