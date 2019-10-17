
public class InheritanceActivity {
public static void main(String[] args) {
	Manager sal1=new Manager(126534,"Peter","Chennai India",237844,65000);
	sal1.calculateSalary();
	Trainee sal2=new Trainee(29846,"Jack","Mumbai India",442085,45000);
	sal2.calculateSalary();
	System.out.println("\n");
	sal1.calculateTransportAllowance();
	sal2.calculateTransportAllowance();
}
}
