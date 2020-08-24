package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.BemTeVi;
import entities.Cachorro;
import entities.Mamifero;
import entities.Papagaio;
import entities.Passaro;
import entities.Vaca;

public class App18 {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal");
		
		Animal animal3 = new BemTeVi("Upcasting");
		Animal animal4 = new Papagaio("Upcasting");
		
		Passaro passaro = new Passaro("Passaro");
		Mamifero mamifero = new Mamifero("Mamifero");

		BemTeVi btv = new BemTeVi("Linux");
		Papagaio ppg = new Papagaio("Trick");
		Cachorro dog = new Cachorro("Bob");
		Vaca cow = new Vaca("Jo");
		
		List<Animal> lista1 = new ArrayList<>();
		
		lista1.add(animal3);
		lista1.add(animal4);
		lista1.add(mamifero);
		lista1.add(passaro);
		
		for (Animal a : lista1) {
			System.out.println("for" + a.falar());
		}
		
		
		System.out.println(animal.falar());
		
		System.out.println(mamifero.falar());
		System.out.println(passaro.falar());		
		
		System.out.println(btv.falar());
		System.out.println(ppg.falar());
		System.out.println(dog.falar());
		System.out.println(cow.falar());
		
		//System.out.println(animal3.falar());
		//System.out.println(lista1.toString());
		
	}

}
