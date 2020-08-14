package application;

import java.util.Scanner;

import entities.ConversorMoeda;

public class App_conversor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar? ");
		double precoDolar = sc.nextDouble();
		System.out.println("Quanto dolares deseja comprar? ");
		double montante = sc.nextDouble();
		
		System.out.println("Montante a ser pago em reais: " + ConversorMoeda.conversao(precoDolar, montante));
		
		sc.close();
		
	}

}
