
public class Calculator {

	public static void main(String[] args) {
		double n1;
		double n2;
		
		n1 = 10.20;
		n2 = 30.40;
		
		//addition 
		double result_add = n1 + n2;
		
		//subtraction
		double result_sub = n1 - n2;
		
		//division
		double result_div = n1 / n2;
		
		//multiplication
		double result_mul = n1 * n2;
		
		//Print the result
		System.out.println("Two numbers are n1 = "+ n1 +" & n2 =" + n2);
		System.out.println("Addition = " + result_add);
		System.out.println("Subtraction = " + result_sub);
		System.out.println("Division = " + result_div);
		System.out.println("Multiplication = " + result_mul);
	}
}
