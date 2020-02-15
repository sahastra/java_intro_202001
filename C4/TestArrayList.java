import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>(); 

		cityList.add("Tokyo");
		cityList.add("Osaka");
		cityList.add("Nagoya");
		cityList.add("Tokyo");
		
		System.out.println("City list (unsorted): " + cityList);
		
		//After sorting
		Collections.sort(cityList);
		
		System.out.println("City list (  sorted) : " + cityList);
		
		System.out.println(cityList.get(1));
		
	}

}
