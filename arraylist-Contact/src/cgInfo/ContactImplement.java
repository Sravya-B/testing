package cgInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactImplement implements ContactMethods {
	private ArrayList<Contacts> info=new ArrayList<Contacts>();
	Scanner scan=new Scanner(System.in);
	@Override
	public ArrayList<Contacts> addContacts() {
		for(int i=0;i<1;i++)
		{
		   
		Long num= scan.nextLong();
		String name=scan.next();
		
		info.add(new Contacts(num,name));
		//System.out.println(info.get(i));
	}
		return null;}


	@Override
	public ArrayList<Contacts> displayAllContacts() {
		/*Iterator<Contacts> it = info.iterator();
		while(it.hasNext()){
			System.out.println(it.next());}*/
		System.out.println("Added contact info is "+info);
		
		return null;
	}

	@Override
	public void removeContact() {
		Long rem=scan.nextLong();
		for(int i=0;i<info.size();i++)
		{
		if(info.contains(rem)) {
			System.out.println(info.remove(info.get(i)));
			
		}
		System.out.println(info);
		
	}

	/*@Override
	public ArrayList<Contacts> modifyContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchByKey() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByValue() {
		// TODO Auto-generated method stub
		
	}
*/
	}
}
