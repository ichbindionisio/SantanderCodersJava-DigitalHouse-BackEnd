package entities;

public class Vaca extends Mamifero{

	public Vaca(String nome) {
		super(nome);
	}
	
	@Override
	public String falar() {
		return nome + " muuu...";
	}

}
