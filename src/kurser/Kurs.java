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
	
	public void getMoment(String momentid) {
		
	}
	
	public ArrayList<Kursdeltagare> getDeltagarlista() {
		return deltagarlista;
	}
	
	public void getDeltagare(String studentid) {
		
	}
	
	public void initMomentdeltagare() {
		for (Moment m : momentlista) {
			m.addMomentdeltagare();
		}
	}
	

}
