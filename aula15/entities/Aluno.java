package entities;

public class Aluno {
	
	private String name;
	private double gradeA;
	private double gradeB;
	private double gradeC;
	
	public Aluno(String name, double gradeA, double gradeB, double gradeC) {
		this.name = name;
		this.gradeA = gradeA;
		this.gradeB = gradeB;
		this.gradeC = gradeC;
	}
	
	public double finalGrade() {
		return gradeA + gradeB + gradeC;
	}
	
	public double missingPoints() {
		if (finalGrade()< 60) {
			return 60 - finalGrade();			
		}
		else {
			return 0.0;
		}
		
	}
}
