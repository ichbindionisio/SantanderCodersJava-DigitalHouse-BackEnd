package application;

import java.util.Locale;
import java.util.Scanner;

import principal.Product;

public class AppProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name: ");	
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + produto.toString());
		
		System.out.println("Enter the number of products to be added: ");
		produto.AddProducts(sc.nextInt());
		
		System.out.println("Updated data: " + produto.toString());
		System.out.println("Enter the number of products to be removed: ");
		produto.RemoveProducts(sc.nextInt());
		System.out.println("Updated data: " + produto.toString());
		
		sc.close();
		
	}

}
