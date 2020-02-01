
public class Calculator2 {//BEGIN CLASS

	public static void main(String[] args) { //BEGIN main()
		double n1;
		double n2;
		n1 = 10.20;
		n2 = 30.40;
		//addition 
		add(n1, n2); //n1 & n2 parameters
		sub(n1, n2); //n1 & n2 parameters
		System.out.println("End of application.");
	} //END main()
	
	//NEW METHOD
	//public, private, default, protected = scope
	//static = no instance
	//void = no return, OR Any datatype
	//add = name of the method
	//n1 = param
	//n2 = param
	public static void add(double n1, double n2) {
		//addition 
		double result_add = n1 + n2;
		System.out.println("Addition = " + result_add);
	}
	
	public static void sub(double n1, double n2) {
		//addition 
		double result_sub = n1 - n2;
		System.out.println("Subtraction = " + result_sub);
	}
} //END CLASS
