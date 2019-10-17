
public abstract class Item {
private int id;
private String title;
private int totalCopies;
Item(int id, String title, int totalCopies){
this.id=id;
this.setTitle(title);
this.setTotalCopies(totalCopies);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;}
	public abstract String toString();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}
	public abstract void print() ;
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (getTotalCopies() != other.getTotalCopies())
			return false;
		return true;
	}
	


}
