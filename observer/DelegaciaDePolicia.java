package designpattern.observer;

public class DelegaciaDePolicia implements Observer {

	@Override
	public void update() {
		System.out.println("Polícia: enviar viatura ao local");
	}
	
	

}
