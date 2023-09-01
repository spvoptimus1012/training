import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albums;

	public AlbumDaoImpl() {
		this.albums = new ArrayList<>();
	}

	@Override
	public void persist(Album a) {
		albums.add(a);
	}

	@Override
	public Album findByTitle(String title) throws InvalidAlbumException {
		for (Album album : albums) {
			if (album.getTitle().equals(title)) {
				return album;
			}
		}
		throw new InvalidAlbumException("Album not found: " + title);
	}

	@Override
	public List<Album> list() {
		return albums;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		List<Album> result = new ArrayList<>();
		for (Album album : albums) {
			if (album.getArtist().equals(artist)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public List<Album> findByGenre(String genre) {
		List<Album> result = new ArrayList<>();
		for (Album album : albums) {
			if (album.getGenre().equals(genre)) {
				result.add(album);
			}
		}
		return result;
	}

	@Override
	public boolean update(Album a) {
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).getTitle().equals(a.getTitle())) {
				albums.set(i, a);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		Iterator<Album> iterator = albums.iterator();
		while (iterator.hasNext()) {
			Album album = iterator.next();
			if (album.getTitle().equals(title)) {
				iterator.remove();
				return true;
			}
		}
		throw new InvalidAlbumException("Album not found for deletion: " + title);
	}
}
