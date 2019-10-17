import java.util.*;
import java.util.Scanner;
//import java.util.Map.Entry;
public class ContactInfo {


/*	public void displayInfo() {
		System.out.println(info);
	}*/
	
	public static void main(String[] args) {
		HashMap<Long,String> info=new HashMap<Long, String>() ;
		Scanner in=new Scanner(System.in);
		
		//Adding data from console
		
		System.out.println("Adding the contact info \n");
		for(int i=0;i<=2;i++) {	
		System.out.println("Enter number");
		Long a= in.nextLong();
		System.out.println("Enter Name");
		String b=in.next();
		
		
		/*System.out.println(" Number is"+b);
		System.out.println(" Name "+b);*/
		
		/* info.put(9854739451L,"Amit");
		info.put(9854739461L,"Akash");
	 */
		
		info.put(a,b);}
	//System.out.println(info);
		
		//Displaying the information from console
		
		System.out.println("All the elements added are ");
		for( Map.Entry m:info.entrySet()) {

		System.out.println(m.getKey()+ " : "+m.getValue());
	}
	//Removing the element from console
	
	System.out.println("Enter key to  remove: ");
	Long p=in.nextLong();
	if(info.containsKey(p)) {
		String digit=info.remove(p);
	
		System.out.println("The removed key is: "+digit +"\n");
		System.out.println( "After removing the element ");
		for( Map.Entry m:info.entrySet()) {
			System.out.println(m.getKey()+ " : "+m.getValue());
		}
	}
	else {
		System.out.println("Entered key is not found"+"\n");
	}
		
		//Searching the value of required key value
		
		System.out.println("Enter the key to be searched: ");
		Long search=in.nextLong();
		if(info.containsKey(search)) {
		//	String name = info.get(search);
			System.out.println("the value of the "+search+ " is "+info.get(search));
		}
		else {
			System.out.println("Key is not found");
		}
			
			
			
		/*info.get(search);
		for( Map.Entry m:info.entrySet()) {
			if(m.getKey()==search) {
				System.out.println("The value of the searched key "+m.getKey()+" is "+m.getValue());
			}
			else {
				System.out.println("Key not found");
			}
			
		}*/
	
		}
	}

