public class Album {
	private String title;
	private String artist;
	private String genre;

	// Constructors
	public Album(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
	}

	public Album(String line) {
		String[] parts = line.split(",");
		if (parts.length == 3) {
			this.title = parts[0].trim();
			this.artist = parts[1].trim();
			this.genre = parts[2].trim();
		} else {
			// Handle invalid input as needed
		}
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Album [title=" + title + ", artist=" + artist + ", genre=" + genre + "]";
	}

}