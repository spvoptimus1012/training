import com.ey.lib.Book;
import com.ey.lib.Member;

public class Testlibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book("The Alchemist");
		
		Member mr = new Member("Phunsuk");
		
		Member m2 = new Member("Ganpat");
		
		bk.status();
		mr.status();
		
		bk.issueBook(mr);
		bk.status();
		mr.status();
		
		bk.issueBook(m2);
		bk.status();
		
		bk.returnBook(mr);
		bk.status();
		mr.status();
		
		
	
		bk.returnBook(m2);
		bk.status();
		
		

	}

}
