import java.util.Scanner;

public class TestUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name : " );
		String name = scan.nextLine();

		System.out.println("Enter your Address : " );
		String address = scan.nextLine();
		
		System.out.println("Enter your Telephone : " );
		String tel = scan.nextLine();
		
		System.out.println("Enter your Age : " );
		int age = scan.nextInt();
		
		scan.close();
		
		System.out.println("---- Confirmation of your information ----");
		
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Telephone : " + tel);
		
		
		System.out.println("Thank you !");
	}

}
