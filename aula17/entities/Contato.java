package entities;

import java.util.List;

public class Contato {

	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco endereco;
	
	public Contato(int id, String nome, int idade, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List adicionar(Contato contato, List lista) {
		lista.add(contato);
		return lista;
	}

	@Override
	public String toString() {
		return "-----------------" + "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone + ", Endereço: " + endereco;
	}
	
}
