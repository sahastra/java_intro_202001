import java.util.Scanner;

public class TestExit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//using while with break
		int count = 0;
		String choice = "";
		
		while (true) {
			
			if (choice.equals("0")) {
				break;
			}
			
			System.out.println("Keep Processing ... count " + count);
			System.out.println("Enter 0 to Exit");
			choice = scan.nextLine();
			count++;
		}
		
		System.out.println("Thank you !");

	}

}
