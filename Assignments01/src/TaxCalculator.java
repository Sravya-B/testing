public class TaxCalculator {
	double taxAmount;
public double calculateTax(String empName, boolean isIndian, double empSal) {
	if(isIndian!=true) {
	try {
		throw new CountryNotValidException();
	}
	catch(CountryNotValidException e) {
		System.out.println("The employee should be an Indian citizen for calculating tax");
		//e.printStackTrace();
	}}
	if(empName==null || empName=="") {
		try {
			throw new EmployeeNameInvalidException();
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println("The employee name cannot be empty");
			//e.printStackTrace();
		}
	}
	
	if(empSal>100000.0 && isIndian==true) {
		taxAmount =empSal *8/100;
		System.out.println("Tax amount is: " +taxAmount);
	}
	else if(empSal>50000 & empSal<100000 && isIndian==true)
	{
		taxAmount =empSal *6/100;
		System.out.println("Tax amount is: " +taxAmount);
	}
	else if(empSal>30000 & empSal<50000 && isIndian==true)
	{
		taxAmount =empSal *5/100;
		System.out.println("Tax amount is: " +taxAmount);
	}
	else if(empSal>10000 & empSal<30000 && isIndian==true)
	{
		taxAmount =empSal *5/100;
		System.out.println("Tax amount is: " +taxAmount);
	}
	
	else if(empSal<10000){
		try {
			throw new TaxNotEligibleException();
		}
		catch(TaxNotEligibleException e) {
			System.out.println("The employee does not need to pay tax");
		//	e.printStackTrace();
		}
	}
		
return taxAmount;
}
}

