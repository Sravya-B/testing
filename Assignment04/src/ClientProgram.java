
public class ClientProgram {
public static void main(String[] args) {
	Book items=new Book(1213,"Becomming",121,"Michelle Obhama");
	items.print();
	System.out.println("\n");
		Video view=new Video(1131,"Arjun Reddy",235, "Sandeep","Action", 2018);
		view.print();
		System.out.println("\n");
		JournalPaper paper=new JournalPaper(1,"Homo Sepians of Mankind",555,"Raman",1981);
paper.print();	
System.out.println("\n");
CD device=new CD(23,"Dil",12,"Vijay","Family Entertainer");
device.print();
}

}
