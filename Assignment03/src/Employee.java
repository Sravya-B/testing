
public class Employee {
long employeeId;
String employeeName;
String employeeAddress;
long employeePhone;
double basicSalary;
double specialAllowance=250.80;
double hra=1000.50;
Employee(long Id,String Name,String address,long phone){
	this.employeeId=Id;
	this.employeeName=Name;
	this.employeeAddress=address;
	this.employeePhone=phone;
}
public void calculateSalary() {
	double salary;
	salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
	System.out.println("The Calculated Salary of an employee is: " +salary);
}
public void calculateTransportAllowance() {
	double transportAllowance = 10/100*basicSalary;
	System.out.println("The default transform allowance of an employee is" +transportAllowance);
}
}
