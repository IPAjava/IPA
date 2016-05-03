package kurser;

import java.util.ArrayList;

import deltagare.Kursdeltagare;
import deltagare.Momentdeltagare;

public class Moment {

	private String namn;
	private String momentid;
	private ArrayList<Kursdeltagare> deltagarlista;
	private ArrayList<Momentdeltagare> momentdeltagare;
	
	public Moment(String namn, String momentid, ArrayList<Kursdeltagare> deltagarlista) {
		this.namn = namn;
		this.momentid = momentid;
		this.deltagarlista = new ArrayList<>();
		this.deltagarlista = deltagarlista;
		momentdeltagare = new ArrayList<>();
	}
	
	public void getMomentdeltagare() {
		
	}
	
	public void addMomentdeltagare() {
		
		for (Kursdeltagare k : deltagarlista) {
			Momentdeltagare m = new Momentdeltagare(momentid, k.getStudentid());
			momentdeltagare.add(m);
		}
		
	}
}
