package entities;

public class Cliente {
	
	private Integer numeroCliente;
	private String sobrenome;
	private Integer cpf;
	private Integer rg;
	private Conta conta;
	
	public Cliente() {
		
	}

	public Cliente(Integer numeroCliente, String sobrenome, Integer cpf, Integer rg) {
		this.numeroCliente = numeroCliente;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.rg = rg;

	}

	public Integer getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(Integer numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public Conta getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "Cliente nº: " + numeroCliente + ", Sobrenome: " + sobrenome + ", CPF: " + cpf + ", RG: " + rg;
	}
	
}
