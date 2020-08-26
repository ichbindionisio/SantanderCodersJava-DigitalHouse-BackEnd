package entities;

public abstract class Conta {

	private Double saldo;
	private Cliente cliente;

	public Conta() {
	}

	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public String toString() {
		return "Saldo atual da conta: " + saldo;
	}
	
}
