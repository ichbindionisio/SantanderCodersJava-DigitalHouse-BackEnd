package principal;

public class Triangulo {
	
	public double A;
	public double B;
	public double C;
	
	public double area() {
		
		double p = (A + B + C) / 2;
		double area = Math.sqrt(p * ((p-A) * (p-B) * (p-C)));
		
		return area;
		
	}
}
