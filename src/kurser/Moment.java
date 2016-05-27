package kurser;

import java.util.ArrayList;
import deltagare.Momentdeltagare;

public class Moment {

	private String namn;
	private String momentid;
	private ArrayList<Momentdeltagare> momentdeltagare;
	
	public Moment(String namn, String momentid) {
		this.namn = namn;
		this.momentid = momentid;
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
	
	public void addMomentdeltagare(Momentdeltagare nyMomentdeltagare) {
			momentdeltagare.add(nyMomentdeltagare);
	}
}
