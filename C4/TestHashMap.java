import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		//1.Storing Information
		HashMap<String, Address> pinAddressDictionary = new HashMap<String, Address>();
		Address a1 = new Address();
		a1.country = "Japan";
		a1.city = "Tokyo";
		a1.pin = "172-0034";
		a1.line1 = "Zoshigaya 1-2-3";
		a1.line2 = "Arapagio";
		
		pinAddressDictionary.put("172-0034", a1);
		
		System.out.println(pinAddressDictionary);
		
		String pinToSearch = "172-0034";
		//2.Retrieve Information using key
		Address address = pinAddressDictionary.get(pinToSearch);
		System.out.println("Pin number : " + pinToSearch + " and Address :" 
		+ address.country + ", "
		+ address.pin + ", "
		+ address.city + ", "
		+ address.line2
		+ address.line1
		);
		
	}

}
