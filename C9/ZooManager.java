
public class ZooManager {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		elephant.temp = 35; //deg C

		Tiger tiger = new Tiger();
		tiger.temp = 45; //deg C

		System.out.println("Current zoo report...");
		System.out.println("Elephant temperature : " + elephant.temp);
		System.out.println("Tiger temperature : " + tiger.temp);
	}
}
