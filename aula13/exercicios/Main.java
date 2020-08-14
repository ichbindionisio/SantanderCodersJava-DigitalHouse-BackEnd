package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello World!");
		
		int idade = 36;
		String nome = "Dionisio";
		
		System.out.println(nome + " tem " + idade + " anos de idade!");
		
		for (int i = 0; i<= 10; i++) {
			System.out.println(8 * i);
		}
		
		int option;
		
		do {
			
			int num1;
			int num2;
			int result = 0;
			
			System.out.println("1 - Somar ");
			System.out.println("2 - Subtrair ");
			System.out.println("3 - Multiplicar ");
			System.out.println("4 - Dividir ");
			System.out.println("5 - Sair ");
			
			System.out.println("Digite a operação: ");
			option = sc.nextInt();
			
			if (option != 5) {
				System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextInt();
			
			
			switch(option) {
			
			case 1: 
				result = num1 + num2;
				break;
				
			case 2:
				result = num1 - num2;
				break;
				
			case 3:
				result = num1 * num2;
				break;
				
			case 4:
				result = num1 / num2;
				break;
				
			case 5:
				break;
				
			}
			
			System.out.println(result);
			}
			
		}while(option != 5);
		
				
		//exercicio 4 da lista
		System.out.println("Digite seu nome: ");
		String name = sc.nextLine();
		System.out.println("Olá " + name);
		
		//exercicio 5 da lista
		System.out.println("Digite a sua idade: ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("É maior de idade!");
		}
		else if(age < 18) {
			System.out.println("É menor de idade!");
		}
		
		//exercicio 6 da lista
		System.out.println("Digite um dia da semana");
		sc.nextLine();
		String dia = sc.nextLine();
		
		
		switch(dia.toLowerCase()) {
		
		case "sabado":
			System.out.println("SEXTOU !!");
			break;
			
		case "domingo":
			System.out.println("SEXTOU !!");
			break;
		
		default:
			System.out.println(":/  ainda não sextou!");
			break;
		}
		
		//exercicio 7 da lista
		System.out.println("Qual seu nome: ");
		String nom = sc.nextLine();
		System.out.println("Qual sua idade? ");
		int idad = sc.nextInt();
		System.out.println("Ja passou no psicotecnico? (s/n) ");
		char psicoTest = sc.next().toLowerCase().charAt(0);
		System.out.println("Já passou nas provas teorico/práticas? (s/n) ");
		char aprovacao = sc.next().toLowerCase().charAt(0);
		
		if (idad >= 18 && psicoTest == 's' && aprovacao == 's') {
			System.out.println(nom + " você já está liberado para dirigir");
		}
		else {
			System.out.println("OPS, vá de carona. Ainda nao tem permissao para dirigir!!");
		}
		
		sc.close();

	}

}
