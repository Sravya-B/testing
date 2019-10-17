
public class Book extends WrittenItem {

	Book(int id, String title, int totalCopies, String author) {
		super(id, title, totalCopies, author);
			System.out.println("Id of the book is "+super.getId());
			System.out.println("Title of the book is "+super.getTitle());
			
	}

	//@Override
	public String toString() {
		System.out.println("Id of the book is " );
		 return "Book []";
		
	}
	public void print() {
		System.out.println("The author of the book is " +this.getAuthor());
	
}}