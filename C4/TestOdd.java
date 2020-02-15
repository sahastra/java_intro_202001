
public class TestOdd {

	public static void main(String[] args) {
		
		//for
		for (int i = 0; i <= 10; i++) { //i = i + 1
			
			if (i % 2 == 1) {
				System.out.println("For : " + i);
			}
		}
		
		//while
		
		int k = 0;
		
		while ( k <= 10 ) {
			
			if (k % 2 == 1) { 
				System.out.println("While : " + k);
			}
			k++;	
		}
		
		//do-while
		
		int x = 0;
				
		do  {
			
			if (x % 2 == 1) { 
				System.out.println("do : " + x);
			}
			
			x++;	
			
		} while ( x <= 10 );
		
	} //end of main()

}
