package deltagare;

public class Momentdeltagare {

	private String momentid;
	private String studentid;
	private Betyg betyg;
	
	public Momentdeltagare(String momentid, String studentid) {
		this.momentid = momentid;
		this.studentid = studentid;
	}
	
	public void addBetyg(String betyg) {
		this.betyg = new Betyg(betyg);
	}
	
	public void changeBetyg(String betyg) {
		this.betyg.updateBetyg(betyg);
	}
	
	public String getMomentid() {
		return momentid;
	}
	
	
	public String getStudentid() {
		return studentid;
	}
	
	public String getBetyg() {
		return this.betyg.getBetyg();
	}
	
}
