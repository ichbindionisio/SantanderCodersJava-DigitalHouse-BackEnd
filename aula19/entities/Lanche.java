package entities;

public abstract class Lanche {

	private Double preco;
	
	public Lanche(Double preco) {
		super();
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double tempoEntrega(double distancia) {
		return 10 * distancia;
	}

	@Override
	public String toString() {
		return "Preço do Lanche: " + preco;
	}
	
}

