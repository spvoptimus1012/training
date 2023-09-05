
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AlbumMenu {
	private static AlbumDao albumDao;

	static {
		try {
			albumDao = new AlbumDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		while (true) {
			System.out.println("Album Menu");
			System.out.println("1- Add Album");
			System.out.println("2- Find Album by Title");
			System.out.println("3- List Albums by Artist");
			System.out.println("4- List Albums by Genre");
			System.out.println("5- Update Album");
			System.out.println("6- Delete Album");
			System.out.println("7- List All Albums");
			System.out.println("8- Exit");
			System.out.println("Enter Choice:");

			int choice = console.nextInt();
			console.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				addAlbum(console);
				break;
			case 2:
				findAlbumByTitle(console);
				break;
			case 3:
				listAlbumsByArtist(console);
				break;
			case 4:
				listAlbumsByGenre(console);
				break;
			case 5:
				updateAlbum(console);
				break;
			case 6:
				deleteAlbum(console);
				break;
			case 7:
				listAllAlbums();
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
	}

	private static void addAlbum(Scanner console) {
		System.out.println("Enter Album Title: ");
		String title = console.nextLine();
		System.out.println("Enter Artist: ");
		String artist = console.nextLine();
		System.out.println("Enter Genre: ");
		String genre = console.nextLine();

		Album album = new Album(title, artist, genre);
		albumDao.persist(album);
		System.out.println("Album added successfully!");
	}

	private static void findAlbumByTitle(Scanner console) {
		System.out.println("Enter Album Title to Find: ");
		String title = console.nextLine();

		try {
			Album foundAlbum = albumDao.findByTitle(title);
			System.out.println("Found Album: " + foundAlbum);
		} catch (InvalidAlbumException e) {
			System.err.println("Error finding album: " + e.getMessage());
		}
	}

	private static void listAlbumsByArtist(Scanner console) {
		System.out.println("Enter Artist to List Albums: ");
		String artist = console.nextLine();

		List<Album> albums = albumDao.findByArtist(artist);
		if (albums.isEmpty()) {
			System.out.println("No albums found for artist: " + artist);
		} else {
			albums.forEach(System.out::println);
		}
	}

	private static void listAlbumsByGenre(Scanner console) {
		System.out.println("Enter Genre to List Albums: ");
		String genre = console.nextLine();

		List<Album> albums = albumDao.findByGenre(genre);
		if (albums.isEmpty()) {
			System.out.println("No albums found for genre: " + genre);
		} else {
			albums.forEach(System.out::println);
		}
	}

	private static void updateAlbum(Scanner console) {
		System.out.println("Enter Album Title to Update: ");
		String title = console.nextLine();

		try {
			Album albumToUpdate = albumDao.findByTitle(title);
			if (albumToUpdate != null) {
				System.out.println("Enter New Genre: ");
				String newGenre = console.nextLine();
				albumToUpdate.setGenre(newGenre);
				String newArtist = console.nextLine();
				albumToUpdate.setArtist(newArtist);
				String newTitle = console.nextLine();
				albumToUpdate.setTitle(newTitle);
				
				albumDao.update(albumToUpdate);
				System.out.println("Album updated successfully!");
			} else {
				System.out.println("Album not found for updating.");
			}
		} catch (InvalidAlbumException e) {
			System.err.println("Error updating album: " + e.getMessage());
		}
	}

	private static void deleteAlbum(Scanner console) {
		System.out.println("Enter Album Title to Delete: ");
		String title = console.nextLine();

		try {
			albumDao.delete(title);
			System.out.println("Album '" + title + "' deleted successfully!");
		} catch (InvalidAlbumException e) {
			System.err.println("Error deleting album: " + e.getMessage());
		}
	}

	private static void listAllAlbums() {
		List<Album> allAlbums = albumDao.list();
		if (allAlbums.isEmpty()) {
			System.out.println("No albums found.");
		} else {
			allAlbums.forEach(System.out::println);
		}
	}
}
