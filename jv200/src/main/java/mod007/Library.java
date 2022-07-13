package mod007;

public class Library {
	private int Serial;
	private static Book book_info;
	private static int leng = 100;
	private static Book[] bookArray = new Book[leng];
	
	private Library() {
		
	}
	private static Library lib= new Library();
//	private String s = new String("홍길동");

	public static Library getLibrary() {
		return lib;		
	}
	
	public void addBook(Book book) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] == null) {
				break;
			}
		}
	}
	public void getBook(int serial) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] == null) {
				break;
			}
		}
	}
}

