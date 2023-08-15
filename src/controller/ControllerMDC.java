package controller;

public class ControllerMDC {

	public ControllerMDC() {
		super ();
	}
	
	public int MDC (int x, int y) {
		if (x == y) { // PARADA -> Quando valores forem iguais, pois assim terá ser o MDC a ser retornado
			return x;
		} else {
			if (x > y) { /* Realizaremos consecutivas subtrações do maior número pelo menor até não ser
				possível subtrair mais, sendo que no caso de x < y inverteremos o valor e seguiremos 
				chamando a própria função*/
				return MDC((x-y), y);
			} else {
				return MDC (y, x);
			}
		}
	}

}
