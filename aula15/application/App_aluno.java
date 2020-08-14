package application;

import java.util.Scanner;

import entities.Aluno;

public class App_aluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do aluno (Nome e notas dos trimestres): ");
		
		String name = sc.nextLine();
		double gradeA = sc.nextDouble();
		double gradeB = sc.nextDouble();
		double gradeC = sc.nextDouble();
		
		Aluno aluno = new Aluno(name, gradeA, gradeB, gradeC);
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade() >= 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSIN %.2f POINTS", aluno.missingPoints());
		}
		
		sc.close();
	}

}
