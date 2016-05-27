package kurser;

import java.util.ArrayList;

import deltagare.Kursdeltagare;

public class Kurs {
	
	private String namn;
	private String kursid;
	private ArrayList<Moment> momentlista;
	private ArrayList<Kursdeltagare> deltagarlista;
	
	public Kurs(String namn, String kursid) {
		this.namn = namn;
		this.kursid = kursid;
		momentlista = new ArrayList<>();
		deltagarlista = new ArrayList<>();
	}
	
	public void addMoment(Moment nyttMoment) {
		momentlista.add(nyttMoment);
	}
	
	public void addDeltagare(Kursdeltagare nyKursdeltagare) {
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
}
