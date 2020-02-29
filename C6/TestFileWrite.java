import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWrite {

	public static void main(String[] args) throws IOException {

		String SEPRATOR1 = ",";
		String SEPRATOR2 = "\n";

		File file = new File("C:/temp/item.txt");
		FileWriter writer = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(writer);

		// File Specification : Item ID,Item Name,Item Price
		// Data Example : 1,Juice,120
		System.out.println("*** Item Registration Program (Inventory Management System) ***");
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Item Id:");
			String id = scan.nextLine();
			bw.write(id);
			bw.write(SEPRATOR1);

			System.out.println("Item Name:");
			String name = scan.nextLine();
			bw.write(name);
			bw.write(SEPRATOR1);

			System.out.println("Item Price:");
			String price = scan.nextLine();
			bw.write(price);
			bw.write(SEPRATOR2);
			
			System.out.println("Enter 0 to Exit, else any key to continue...");
			String choice = scan.nextLine();
			
			if (choice.equals("0")) {
				break;
			}
			
		}

		bw.close();
		writer.close();

		System.out.println("Thank you !");
	}
}
