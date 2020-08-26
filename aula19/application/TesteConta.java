package application;

import java.util.Scanner;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Banco Santander Coders");
		System.out.println();
		int menuOpt = -1;
		
		ContaCorrente cc;
		ContaPoupanca cp;
		
		
		do {
			System.out.println("Digite a opção desejada: ");
			System.out.println();
			System.out.println("1 - Abrir Conta");
			System.out.println("2 - Acessar Conta");
			System.out.println("3 - Verificar total investido (poupança)");
			System.out.println("4 - Ver total inadimplente (cheque especial)");
			System.out.println("5 - Fechar conta");
			System.out.println("6 - Sair");
			
			menuOpt = sc.nextInt();
			
			switch(menuOpt) {
			
			case 1:
				System.out.println("Digite abaixo os dados do cliente e da conta");
				System.out.println("Número do cliente: ");
				int numero = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o último sobrenome: ");
				String sobrenome = sc.nextLine();
				System.out.println("Digite o CPF (somente números): ");
				int cpf = sc.nextInt();
				System.out.println("Digite o RG: ");
				sc.nextLine();
				int rg = sc.nextInt();
				sc.hasNextLine();
				System.out.println("Cliente deseja abrir Conta Corrente ou Conta Poupança (C/P) ? ");
				char tipo = sc.next().toLowerCase().charAt(0);
				
				switch(tipo) {
				
				case 'c':
					
					System.out.println("Quanto deseja ter de limite especial? ");
					double limite = sc.nextDouble();
					
					cc = new ContaCorrente(new Cliente(numero, sobrenome, cpf, rg), limite);
					break;
					
				case 'p':
					
					System.out.println("Qual a taxa de juros proposta? ");
					double taxa = sc.nextDouble();
					
					cp = new ContaPoupanca(new Cliente(numero, sobrenome, cpf, rg), taxa);
					break;
					
				}
				
			case 2:
				
				System.out.println("Digite o numero da conta que deseja acessar: ");
				int numeroAcessar = sc.nextInt();
				System.out.println("Qual operação deseja efetuar? Sacar ou Depositar (S/D)");
				char operacao = sc.next().toLowerCase().charAt(0);
				
				switch(operacao) {
				
				case 's':
					
					
					
				}
			
			}
			
		}while(menuOpt != 6);
		
		sc.close();
	}

}
