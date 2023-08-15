package controller;

public class ControllerMDC {

	public ControllerMDC() {
		super ();
	}
	
	public int MDC (int x, int y) {
		if (x == y) { // PARADA -> Quando valores forem iguais, pois assim ter� ser o MDC a ser retornado
			return x;
		} else {
			if (x > y) { /* Realizaremos consecutivas subtra��es do maior n�mero pelo menor at� n�o ser
				poss�vel subtrair mais, sendo que no caso de x < y inverteremos o valor e seguiremos 
				chamando a pr�pria fun��o*/
				return MDC((x-y), y);
			} else {
				return MDC (y, x);
			}
		}
	}

}
