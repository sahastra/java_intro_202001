
public class Item {
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Price can not be -ve ");
			price = 0;
		}
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			System.out.println("quantity can not be -ve ");
			quantity = 0;
		}
		this.quantity = quantity;
	}
	
	private String id;
	private String name;
	private double price;
	private int quantity;
}
