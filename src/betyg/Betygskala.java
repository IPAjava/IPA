package betyg;

public class Betygskala {

	private String betygSkala;
	
	
	public Betygskala(String fakultet) {
		if(fakultet.equals("filfak")) {
			 this.betygSkala = "U-G-VG";
		}
		
		else
			 this.betygSkala = "1-5";
	}
	
	public String getBetygSkala() {
		return betygSkala;
	}
	
	
}
