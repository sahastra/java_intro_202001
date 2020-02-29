import java.util.ArrayList;
import java.util.Scanner;

public class TransactionManager {
	/**
	 * Method to create transaction and return it
	 * @return Transaction
	 */
	public ArrayList<Transaction> createTransaction() {
		//Loop to user to enter purchased item details
		//1. Enter Item id
		//2. Enter Quantity
		ArrayList<Item> itemList = new ArrayList<Item>();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter item id : " );
			String itemId = scan.nextLine();
			
			System.out.println("Enter item Quantity : " );
			String quantity = scan.nextLine();
			
			Item item = new Item();
			item.id = itemId;
			item.quantity = Integer.parseInt(quantity);
			
			itemList.add(item);
			
			System.out.println("Enter 0 to Exit");
			String choice = scan.nextLine();
			
			if (choice.equals("0")) {
				break;
			}
		}
		
		
		
		Transaction transaction = new Transaction();
		transaction.itemList 
		
		return null;
	}
		
	/**
	 * Method to print Transaction details, such Item price, quantity 
	 * and total
	 * @param transaction 
	 */
	public void printTransaction(Transaction transaction) {
		
	}

}
