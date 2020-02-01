
public class TestDecision {

	public static void main(String[] args) {
		//if salary > 1000, tax 40%
		//if salary = 1000, tax 30%
		//if salary < 1000, tax 10%
		
		double salary = 900; //salary = 700, tax = 300
		double tax;
		double netSalary;
		
		if (salary > 1000) {
			double taxRate = 0.4;
			tax = salary * taxRate;
			netSalary = salary - tax;
			printResult(salary, tax, netSalary, taxRate);
		}
		
		if (salary == 1000) {
			double taxRate = 0.3;
			tax = salary * taxRate;
			netSalary = salary - tax;
			printResult(salary, tax, netSalary, taxRate);
		}
		
		if (salary < 1000) {
			double taxRate = 0.1;
			tax = salary * taxRate;
			netSalary = salary - tax;
			printResult(salary, tax, netSalary, taxRate);
		}

	}
	
	public static void printResult(double salary, double tax, double netSalary, double taxRate) {
		System.out.println("Salary = " + salary );
		System.out.println("Tax = " + tax + " with tax of " + (taxRate * 100) + "%");
		System.out.println("Net Salary = " + netSalary );
	}

}
