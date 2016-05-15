package systemstart;

import kurser.*;

public class Main {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Kurslista kurslista = new Kurslista();
		kurslista.init();
		kurslista.print();
	}

}
