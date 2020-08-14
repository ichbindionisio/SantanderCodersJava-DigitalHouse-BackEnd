package entities;

public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double area() {
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return (2 * this.altura) + (2 * this.largura);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
	}

	@Override
	public String toString() {
		return "Retangulo: " + area() + 
				"\nPerimetro: " + perimetro() + 
				"\nDiagonal: " + diagonal();
	}
	
}
