package observer_util;


import betyg.Betygsadapter;

public class DisplayController implements Observer {
	private String id;
	private Subject momentdeltagare;
	private Betygsadapter betyg;

	public DisplayController(Subject subj, String id) {
		this.id = id;
		System.out.println("DisplayController: Skapades nu - " + id);
		
		momentdeltagare = subj;		
		momentdeltagare.Attach(this);
	}

	public String getID() {
		return id;
	}
	
	public void Update() {
		betyg = momentdeltagare.GetState();
		System.out.println( "DisplayController UPDATE: " + id + " har fått veta att betyget ändrats till " + betyg.getBetyg() + ".");
	}
	
}