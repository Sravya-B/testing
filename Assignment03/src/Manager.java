public class Manager extends Employee{

	Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		this.basicSalary=salary;
		
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary /100;
		System.out.println("The transport allowance of a Manager is " +transportAllowance);
	}
}
