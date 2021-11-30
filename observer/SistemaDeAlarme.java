// Esta classe é o sujeito do padrão de projeto Obsever

package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeAlarme {

	private List<Observer> observers;
	// se o valor da variavel sensor for false significa que a porta está fechada; 
	// se o valor for true significa que a porta está aberta
	private boolean sensor;
	
	public SistemaDeAlarme() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
		sensor = false;
	}
	
	void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	void detachObserver(Observer observer) {
		observers.remove(observer);
	}
	
	void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	void modifyState() {
		sensor = true;
		notifyObservers();
	}
		
}
