package entities;

public class ConversorMoeda {
	
	public static final double IOF = 0.06;
	
	public static double conversao(double precoDolar, double montanteComprar) {
		return montanteComprar * precoDolar * (1.0 + IOF);
	}
}
