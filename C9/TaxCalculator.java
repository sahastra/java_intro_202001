
public class TaxCalculator {

	/**
	 * Method to calculate tax for the specified Gross income and tax rate
	 * @param grossIncome Gross income to calculate the tax
	 * @param taxRate tax rate apply on Gross income
	 * @return net income after deducting tax amount from the gross income
	 */
	public double getTax(double grossIncome, double taxRate) {
		
		double taxAmount = 0;
		double netIncome = 0;
		
		taxAmount = grossIncome * taxRate;		
		netIncome = grossIncome - taxAmount;
		
		return netIncome;
	}
}

