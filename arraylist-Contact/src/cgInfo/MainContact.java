package cgInfo;

public class MainContact {
	public static void main(String[] args) {
		ContactImplement con=new ContactImplement();
		con.addContacts();
		con.displayAllContacts();
		con.removeContact();
	}

}
