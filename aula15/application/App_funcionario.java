package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Salário bruto: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");
		double taxa = sc.nextDouble();
		
		Funcionario func = new Funcionario(nome, salarioBruto, taxa);
		
		System.out.println();
		
		System.out.println("Empregado: " + func.toString());
		
		System.out.println();
		
		System.out.println("Qual percentagem para aumento do salário? ");
		double percent = sc.nextDouble();
		
		func.increaseSalary(percent);
		
		System.out.println("Dados atualizados: " + func.toString());
		
		sc.close();
	}
}
