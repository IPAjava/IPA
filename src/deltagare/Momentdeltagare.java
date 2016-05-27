package deltagare;

import systemstart.Kontrollant;

public class Momentdeltagare {

	private String momentid;
	private String studentid;
	private Betyg betyg;
	private boolean betygFinns;
	private boolean lockedBetyg = false;
	
	public Momentdeltagare(String momentid, String studentid) {
		this.momentid = momentid;
		this.studentid = studentid;
		this.betygFinns = false;
	}

	public void addBetyg(String betyg, Kontrollant kontrollant) {
		this.betyg = new Betyg(betyg);
		this.betygFinns = true;
		System.out.println("Du gav betyget " + betyg + " till studenten " + studentid + " för moment " + momentid  + ".");
		kontrollant.utskriftMomentdeltagare();
	}

	public void changeBetyg(String betyg, Kontrollant kontrollant) {
		this.betyg.updateBetyg(betyg);
		System.out.println("Du ändrade betyget till " + betyg + " för studenten " + studentid + " i moment " + momentid  + ".");
		kontrollant.utskriftMomentdeltagare();
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
	
	public boolean getLockedBetyg(){
		return this.lockedBetyg;
	}
	
	public boolean getBetygFinns(){
		return this.betygFinns;
	}

	public void sendLadok(Kontrollant kontrollant){
		lockedBetyg = true;
		System.out.println("Betyget har skickats till Ladok för rapportering.");
		kontrollant.utskriftMoment();
	}

}
