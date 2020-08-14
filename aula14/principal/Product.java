package principal;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		double total = this.price * this.quantity;
		return total;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
	}
	
}
