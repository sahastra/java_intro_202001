
public class Customer {
	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null) {
			address = "Undefined Name";
		}
		this.address = address;
	}

	public void setName(String name) {
		if (name == null) {
			name = "Undefined Name";
		}
		this.name = name;
	}
	

}
