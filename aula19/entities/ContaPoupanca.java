package entities;

public class ContaPoupanca extends Conta{

	private Double taxaDeJuros;

	public ContaPoupanca(Cliente cliente, double taxaDeJuros) {
		super();
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
	@Override
	public void sacar(double valor) {
		if (super.getSaldo() < valor) {
			System.out.println("Não há saldo suficiente! ");
		}
		else {
			super.sacar(valor);
		}
		
	}
	
	public void recolherJuros() {
		double valor = getSaldo() * this.taxaDeJuros;
		super.depositar(valor);
	}

}
