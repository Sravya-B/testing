
public abstract class WrittenItem extends Item{

	private String author;

	WrittenItem(int id, String title, int totalCopies, String author) {
		super(id, title, totalCopies);
		this.author=author;
	}
	public String toString() {
	return super.getId() +" is the id number of the book with title "+getTitle();
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
