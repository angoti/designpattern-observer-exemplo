package designpattern.observer;

public class CompanhiaDeSeguros implements Observer {

	@Override
	public void update() {
		System.out.println("Seguros: acionar sinistro ... ");		
	}

}
