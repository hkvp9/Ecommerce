
public class Book extends Product{

	String Author;
	String Genre;
	String Isbn;
	
	
	public Book(String Author, String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	
	public Book(String name, double price, int quantity, String Author, String Genre, String Isbn) {
		super(name, price, quantity);
	
	}

	
	@Override
	public void getDetails() {
		System.out.println("We sell books that’ll make you smarter at programming");
	}


	
	
	
	
	
}
