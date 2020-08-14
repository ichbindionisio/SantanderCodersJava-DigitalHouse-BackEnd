package application;

import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;

public class App_geometria {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do retângulo (L x A): ");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		
		Retangulo retang = new Retangulo(largura, altura);
				
		
		System.out.println("Área: " + retang.area());
		System.out.println("Perímetro: " + retang.perimetro());
		System.out.println("Diagonal: " + retang.diagonal());
		
				
		System.out.println(Circulo.circunferencia(3.0));
		System.out.println(Circulo.volume(3.0));
		
		sc.close();

	}

}
