package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contato;
import entities.Endereco;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contato> contatos = new ArrayList<>();
		Contato contato;
		
		int menuOption = -1;
		int id = -1;
		
		do {
			
			if (menuOption == 0) {
				break;
			}
			else if (menuOption != 0){
			
				System.out.printf("**** Menu Principal *****\n");
				System.out.printf("[ 1 ] Incluir Contato\n");
				System.out.printf("[ 2 ] Excluir Contato\n");
				System.out.printf("[ 3 ] Listar Contatos\n");
				System.out.printf("[ 4 ] Pesquisar Contato\n");
				System.out.printf("[ 0 ] Encerrar o Programa\n");
				System.out.printf("\nOpção Desejada: ");
				
				menuOption = sc.nextInt();
			}
			
			switch(menuOption) {
			
			case 1:
					
				do {
					System.out.println("Digite o ID do contato que deseja adicionar: ");
					id = sc.nextInt();
					
					if (id < 0) {
						break;
					}
					
					sc.nextLine();
					System.out.println("Digite o nome do contato: ");
					String nome = sc.nextLine();
					System.out.println("Digite a idade do contato: ");
					int idade = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o telefone do contato: ");
					String telefone = sc.nextLine();
					System.out.println("Digite o endereço do contato: ");
					System.out.println("Digite a rua: ");
					String rua = sc.nextLine();
					System.out.println("Digite o numero: ");
					int numero = sc.nextInt();
					System.out.println("Digite o bairro: ");
					sc.nextLine();
					String bairro = sc.nextLine();
					System.out.println("Digite a cidade: ");
					String cidade = sc.nextLine();
					System.out.println("Digite o estado: ");
					String estado = sc.nextLine();
					
					contatos.add(new Contato(id, nome, idade, telefone, new Endereco(rua, numero, bairro, cidade, estado)));
					
				}while(id > 0);
				
				break;
								
			case 2:
				
				System.out.println("Digite o ID do contato que deseja remover: ");
				int idRemove = sc.nextInt();
				contatos.remove(idRemove);
				
				break;
				
			case 3:
				System.out.println();
				for (Contato c : contatos) {
					System.out.println(c);
					}
				System.out.println();
				break;
			
			case 4:
				System.out.println("Digite o ID do contato que deseja localizar: ");
				int idLocaliza = sc.nextInt();
				for (Contato c : contatos) {
					if (idLocaliza == c.getId()) {
						System.out.println(c.toString());
						break;
					}
					else if (idLocaliza != c.getId()) {
						System.out.println("ID não localizado !");
					}
				}
				break;
			
			}
			
		}while (menuOption > 0); 
				
		sc.close();
	}

}
