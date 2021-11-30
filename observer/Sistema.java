package designpattern.observer;

public class Sistema {
	
	public static void main(String[] args) {
		SistemaDeAlarme sa = new SistemaDeAlarme();
		DelegaciaDePolicia pol = new DelegaciaDePolicia();
		CompanhiaDeSeguros seg = new CompanhiaDeSeguros();
		
		sa.attachObserver(pol);
		sa.attachObserver(seg);
		
		sa.modifyState();
	}

}
