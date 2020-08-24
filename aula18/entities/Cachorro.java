package entities;

public class Cachorro extends Mamifero{

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String falar() {
		return nome + " au-au...";
	}
	
}
