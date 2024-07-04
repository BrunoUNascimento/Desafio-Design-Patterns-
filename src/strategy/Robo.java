package strategy;

public class Robo {

	private Comportamento strategy;
	
	public void setStrategy(Comportamento o) {
		this.strategy= o;
	}
	
	public void mover() {
		strategy.mover();
	}
}
