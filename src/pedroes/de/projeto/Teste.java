package pedroes.de.projeto;

import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		Singletonlazy lazy = Singletonlazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
	}
	
}
