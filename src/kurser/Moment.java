package kurser;

import java.util.ArrayList;

import deltagare.Kursdeltagare;

public class Moment {

	private String namn;
	private String momentid;
	private ArrayList<Kursdeltagare> deltagarlista;
	
	public Moment(String namn, String momentid, ArrayList<Kursdeltagare> deltagarlista) {
		this.namn = namn;
		this.momentid = momentid;
		this.deltagarlista = new ArrayList<>();
		this.deltagarlista = deltagarlista;
	}
	
	public void getMomentdeltagare() {
		
	}
	
	public void addMomentdeltagare(String studentid, String momentid) {
		
	}
}
