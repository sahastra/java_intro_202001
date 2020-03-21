import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase{

	public void testGetTax() {
		
		TaxCalculator tc = new TaxCalculator();
		double grossIncome = 700;
		double taxRate = 0.1; //10%
		
		double netIncome = tc.getTax(grossIncome, taxRate);
		
		assertEquals(netIncome, 600.0);
		
	}
}
