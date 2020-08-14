package entities;

public class Funcionario {

	private String name;
	private double grossSalary;
	private double tax;
	
	public Funcionario(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary += this.grossSalary / percent;
	}

	@Override
	public String toString() {
		return name + ", R$ " + netSalary();
	}
}
