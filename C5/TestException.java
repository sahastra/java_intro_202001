
public class TestException {

	public static void main(String[] args) {
		
		String[] customerNames = {"John", null, "Taro", "Lisa", "Smith"};
		
		for (int  i = 0; i < 5; i++ ) {
			
			try {
				System.out.println("Record " + i);
				System.out.println("Upper " + customerNames[i].toUpperCase());			
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				//Release the resources, Guaranteed
			}
		}
		
		System.out.println("Thank you !");
	}
}
