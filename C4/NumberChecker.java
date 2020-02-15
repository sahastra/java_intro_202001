import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		//1. Get Input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer number : " );
		int n = scan.nextInt();
		
		//2.Check the Input
		
		if (n % 2 == 0) {
			System.out.println("Your number is EVEN, " + n);
		} else {
			System.out.println("Your number is ODD, " + n);
		}
		
		System.out.println("Thank you !");
	}

}
