package betyg;

public class Tekfakbetyg implements Betygsadapter {

	private String betyg;
	
	
	public Tekfakbetyg(String betyg) {
		this.betyg = betyg;
	}
	
	public String getBetyg() {
		return betyg;
	}
	
	public void updateBetyg(String betyg) {
		this.betyg = betyg;
	}
	

}
