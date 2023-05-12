package quiz12;

public class Product {

	private String name;
	private int price;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	 public int getPrice() {
		 return price;
	 }
	
}
