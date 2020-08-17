package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class App16 {

	public static void main(String[] args) {
		
		Produto prod = new Produto("TV", 900.00, 10);
		Produto prod2 = new Produto("PC", 1900.00, 100);
		
		List<Produto> lista = new ArrayList();
		
		lista.add(prod);
		lista.add(prod2);
			
		double soma = 0.0;
		
		/*for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).toString());
			soma += lista.get(i).getPreco();
			
		}
		System.out.println(soma);
		*/
		
		for (Produto p : lista) {
			soma += p.getPreco();
		}
		
		System.out.println(soma);
		

	}

}
