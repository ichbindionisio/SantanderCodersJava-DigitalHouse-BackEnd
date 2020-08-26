package entities;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche{

	private List<String> ingredientes = new ArrayList<>();

	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}
	
	
		
	@Override
	public String toString() {
		return "Sanduiche, ingredientes escolhidos: " + ingredientes;
	}
	
	
	
}
