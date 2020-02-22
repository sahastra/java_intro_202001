import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileHandling {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("customer.csv");
    
		Scanner scan = new Scanner(file);
		double sumBalance = 0; //SUM_BALANCE, sum_balance

		while (scan.hasNext()) {
			String record = scan.nextLine();
			String[] cells = record.split(",");
			System.out.println(cells[0].toUpperCase() + " " + cells[1].toLowerCase());
			sumBalance = sumBalance + Double.parseDouble(cells[3]);
		}

		System.out.println("Sum balance = " + sumBalance);
		System.out.println("Thank you !");
	}
}
