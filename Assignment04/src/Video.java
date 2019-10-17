
public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;

	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year=" + year + "]";
	}
Video(int id, String title, int totalCopies, String director, String genre, int year) {
		super(id, title, totalCopies);
		this.director=director;
		this.genre=genre;
		this.year=year;
		System.out.println("The title of the video is " +getTitle());
		System.out.println("The genre of the video is " +this.genre);
	}

public void print() {
	System.out.println("The director of the video " +getTitle()+" is "+this.director);
	
}


}
