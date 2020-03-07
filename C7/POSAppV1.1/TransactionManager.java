import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class TransactionManager {
	
	//HashMap to hold data loaded from the item.txt file
	public static HashMap<String, Item> itemMap = null;
	
	/**
	 * Method to create transaction and return it
	 * @return Transaction
	 */
	public Transaction createTransaction() {
		
		//Load item.txt to create HashMap, load file if map is null, else reuse already loaded map
		if (itemMap == null) {
			System.out.println("Loading Item data into hashmap..." );
			itemMap = createItemMap();
		}
		
		//Loop to user to enter purchased item details
		//1. Enter Item id
		//2. Enter Quantity
		
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		while (true) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter item id : " );
			String itemId = scan.nextLine();
			
			//pull out item object using its id from the hashmap created above
			Item item = itemMap.get(itemId);
			
			if (item == null) {
				System.out.println("Invalid item id... Please try again." );
				continue;
			}
			
			System.out.println("Enter item Quantity : " );
			String quantity = scan.nextLine();
			
			item.setId(itemId); //item.id = itemId
			item.setQuantity(Integer.parseInt(quantity));
			
			itemList.add(item);
			
			System.out.println("Add more items ? [Y/N]: ");
			String choice = scan.nextLine();
			
			if (choice.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		//creating a transaction from the List of items
		Transaction transaction = new Transaction();

		//Generate ID using Time Milliseconds and convert it to String
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		 
		transaction.id =  String.valueOf(System.currentTimeMillis()); 
		transaction.tdate = fmt.format(new Date()); //new Date() will give current date
		transaction.itemList = itemList;
		
		return transaction;
	}
	
	//Method to load item.txt file into HashMap
	private HashMap<String, Item> createItemMap() {
		
		File file = new File("item.txt");
		HashMap<String, Item> map = new HashMap<String, Item>();
		
		try {
			
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				String record = scan.nextLine();
				String[] cells = record.split(",");
				
				Item item = new Item();
				item.setId(cells[0]);
				item.setName(cells[1]);
				item.setPrice(Double.parseDouble(cells[2]));
			
				map.put(item.getId(), item);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}

	/**
	 * Method to print Transaction details, such Item price, quantity 
	 * and total
	 * @param transaction 
	 */
	public void printTransaction(Transaction transaction) {
		
		double grandTotal = 0;
		
		System.out.println("*** Transaction Receipt *** ");
		System.out.println("Transaction Id : " + transaction.id + " (" + transaction.tdate + ")");

		System.out.println("===========================================");	

		for (Item item : transaction.itemList) {
			double itemTotal =  item.getPrice() * item.getQuantity();

			System.out.printf("%s  %.0f x %d = %.0f ", item.getName(), item.getPrice(), item.getQuantity(), itemTotal);
			System.out.println();

			
			grandTotal = grandTotal + itemTotal; 
		}

		System.out.println("-----------------------");	
		System.out.printf("Total Amount   = %.0f " , grandTotal);	
		System.out.println();
		System.out.println("===========================================");	
	}

}
