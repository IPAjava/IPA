package databas;

public class PersistentStorage {
	
	
	private DBfasad dbfasad;
	
	private String studentid;
	private String momentid;
	private String betyg;
	
	public PersistentStorage(String studentid, String momentid, String betyg) {
		dbfasad = new DBfasad();
		this.studentid = studentid;
		this.momentid = momentid;
		this.betyg = betyg;
	}
	
	public void lagraIDatabas() throws Exception {
		dbfasad.lagraIDatabas(studentid, momentid, betyg);
	}

}
