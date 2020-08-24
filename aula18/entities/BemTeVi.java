package entities;

public class BemTeVi extends Passaro{

	public BemTeVi(String nome) {
		super(nome);
	}
	
	@Override
	public String falar() {
		return nome + " piu-piu...";
	}
	
}
