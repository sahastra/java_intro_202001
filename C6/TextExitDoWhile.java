import java.util.Scanner;

public class TextExitDoWhile {

	public static void main(String[] args) {
		//Text Exit Using do While
		Scanner scan = new Scanner(System.in);
		String choice = "";
		int count = 0;
		
		do {


			System.out.println("Keep Processing ... count " + count);
	
			System.out.println("Enter 0 to Exit");
			choice = scan.nextLine();
			count++;
		
		} while (!choice.equals("0"));
		
		System.out.println("Thank you !");
	}

}
