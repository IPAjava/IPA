package betyg;

public class Filfakbetyg implements Betygsadapter {

	private String betyg;
	
	
	public Filfakbetyg(String betyg) {
		this.betyg = betyg;
	}
	
	public String getBetyg() {
		return betyg;
	}
	
	public void updateBetyg(String betyg) {
		this.betyg = betyg;
	}
	
	
	
}
