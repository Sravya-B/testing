
public class LibraryInterfaceDemo {
public static void main(String[] args) {
	KidUsers library1= new KidUsers();
	library1.registerAccount(10);
	library1.registerAccount(18);
	library1.requestBook("Kids");
	System.out.println("\n");
	AdultUser library2=new AdultUser();
	library2.registerAccount(5);
	library2.registerAccount(23);
	library2.requestBook("Kids");
	library2.requestBook("Fiction");
}
}
