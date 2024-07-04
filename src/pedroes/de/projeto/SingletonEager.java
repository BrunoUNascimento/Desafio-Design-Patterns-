package pedroes.de.projeto;

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return SingletonEager.instancia;
	}
}
