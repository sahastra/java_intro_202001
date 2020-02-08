
public class CustomerManager {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName(null);
		c1.setAddress(null);
		
		System.out.println("Customer 1 information :");
		System.out.println("Name = " + c1.getName());
		System.out.println("Address = " + c1.getAddress());
	}
}
