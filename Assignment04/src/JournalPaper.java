
public class JournalPaper extends WrittenItem {
private int year;
	JournalPaper(int id, String title, int totalCopies, String author,int year) {
		super(id, title, totalCopies, author);
		this.year=year;
	}
	@Override
	public void print() {
		System.out.println("Year of publishing of the book "+getTitle()+" is " +this.year);
		
	}

}
