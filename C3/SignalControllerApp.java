
public class SignalControllerApp {

	public static void main(String[] args) {
		//Type name, 
		//new = special keyword to create instance (object) from template (class)
		Signal s1 = new Signal();
		System.out.println("Signal 1: ");
		s1.showGreen();
		
		Signal s2 = new Signal();
		System.out.println("Signal 2: ");
		s2.showYellow();
		
		Signal s3 = new Signal();
		System.out.println("Signal 3: ");
		s3.showRed();
		
		Signal s4 = new Signal();
		System.out.println("Signal 4: ");
		s4.showGreen();
		
		Signal s5 = new Signal();
		System.out.println("Signal 5: ");
		s5.showGreen();
	}

}
