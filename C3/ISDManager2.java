
public class ISDManager2 {

	public static void main(String[] args) {
		String[] isdCodeList = new String[3000]; //3 = SIZE
		
		isdCodeList[0] = "81";
		isdCodeList[1] = "1";
		isdCodeList[2] = "44";
		//TODO : add for all the countries
		
		String countryName = "Japan";
		
		if (countryName.equals("Japan")) {
			System.out.println("ISD Code = " + isdCodeList[0]);
		}

		if (countryName.equals("USA")) {
			System.out.println("ISD Code = " + isdCodeList[1]);
		}

		if (countryName.equals("UK")) {
			System.out.println("ISD Code = " + isdCodeList[2]);
		}

	}

}
