package observer_util;

import java.util.ArrayList;
import java.util.Iterator;

import betyg.Betygsadapter;



public abstract class Subject {

	private ArrayList<Observer> observers;

	public Subject() {
		observers = new ArrayList<Observer>();
		//System.out.println("Subject: Skapades nu."); 
	}

	public void Attach (Observer obs) {
		observers.add(obs);
		//System.out.println("Subject: Lagt till i prenumerantlistan: " + obs.getID());
	}

	public void Notify() {
		Iterator<Observer> e = observers.iterator();
		while(e.hasNext()) {
			Observer obs = (Observer)e.next();
			obs.Update();
			//System.out.println("Subject NOTITY: Gjort UPDATE hos observatör " + obs.getID());
		}
	}

	abstract public Betygsadapter GetState();
	
	abstract public void SetState();
	
}