
public class POSMain {

	public static void main(String[] args) {
		TransactionManager manager = new TransactionManager();
		//1. Create the Transaction for each customer separately
		Transaction t = manager.createTransaction();
		
		//2. Print the Transaction receipt
		manager.printTransaction(t);
		
		System.out.print("Thank you ! ");
	}
}
