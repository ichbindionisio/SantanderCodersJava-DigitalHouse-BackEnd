package application;

import java.util.Scanner;

import principal.Triangulo;

public class App14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: ");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		
		System.out.println("A área do triangulo X é: " + x.area());
		System.out.println("A área do triangulo Y é: " + y.area());
		
		if (x.area() > y.area()) {
			System.out.println("A area do triangulo X é maior!");
		}
		else {
			System.out.println("A area do triangulo Y é maior!");
		}
		
		sc.close();
	}
}
