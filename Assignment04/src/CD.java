
public class CD extends MediaItem{
	private String artist;
	private String genre;
CD(int id, String title, int totalCopies,String artist, String genre) {
		super(id, title, totalCopies);
	this.artist=artist;
	this.genre=genre;
	}
@Override
public void print() {
	System.out.println("Name of the Artist in the video " +getTitle()+" is " +this.artist);
	
}

}
