package entities;

public class ContaCorrente extends Conta{

	private Double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
	public void depositarCheque(Cheque cheque) {
		super.depositar(cheque.getValor());
	}
	
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if((limite + limiteChequeEspecial) >= 0) {
			super.sacar(valor);
			if(limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial - limite;
			}	
		}
		else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}
	
}
