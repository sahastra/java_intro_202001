
public class ISDManager {

	public static void main(String[] args) {
		String isdCodeJP = "81";
		String isdCodeUS = "1";
		String isdCodeUK = "44";
		//TODO : add for all the countries
		
		String countryName = "Japan";
		
		if (countryName.equals("Japan")) {
			System.out.println("ISD Code = " + isdCodeJP);
		}

		if (countryName.equals("USA")) {
			System.out.println("ISD Code = " + isdCodeUS);
		}

		if (countryName.equals("UK")) {
			System.out.println("ISD Code = " + isdCodeUK);
		}

	}

}
