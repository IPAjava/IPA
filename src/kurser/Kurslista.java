package kurser;

import java.util.ArrayList;

public class Kurslista {

	private ArrayList<Kurs> kurslista;

	public Kurslista() {
		kurslista = new ArrayList<>();
	}

	public void addKurs(Kurs nyKurs) {
		kurslista.add(nyKurs);
	}

	public ArrayList<Kurs> getKurslista() {
		return kurslista;
	}
}

