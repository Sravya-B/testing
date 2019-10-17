
public abstract class MediaItem extends Item{
private int runtime;
	MediaItem(int id, String title, int totalCopies) {
		super(id, title, totalCopies);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}


}
