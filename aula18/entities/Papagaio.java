package entities;

public class Papagaio extends Passaro{

	public Papagaio(String nome) {
		super(nome);
	}
	
	@Override
	public String falar() {
		return nome + " repete...";
	}
	
}
