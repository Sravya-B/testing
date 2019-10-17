	public class CalculatorSimulator extends TaxCalculator{
		public static void main(String args[]) {
			CalculatorSimulator tax=new CalculatorSimulator();
			//tax.calculateTax("Sravya", true, 40000);
			tax.calculateTax("Ron", false, 34000);
			tax.calculateTax("Tim", true, 1000);
			tax.calculateTax("Jack", true, 55000);
			tax.calculateTax("", true, 30000);
		}
		}



