
public class Trainee extends Employee {

	Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		this.basicSalary=salary;
		
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("The transform allowance of a Trainee is " +transportAllowance);
	}
}
