/*
 * Hannah Kelly
 * 8/13/18
 */
abstract class Product {

	private String name;
	private double price;
	private int quantity;
	
public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
public abstract void getDetails();

			

//	private char size;
//	private String author;
//	private String color;
//	private String category;

	
//	public static void setSomeNumber(String someThing) {
//		Product.someThing = someThing;
		
	

	
		
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	/**
//	 * @return the price
//	 */
//	public double getPrice() {
//		return price;
//	}
//	/**
//	 * @param price the price to set
//	 */
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	/**
//	 * @return the category
//	 */
//	public String getCategory() {
//		return category;
//	}
//	/**
//	 * @param category the category to set
//	 */
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	/**
//	 * @return the quantity
//	 */
//	public int getQuantity() {
//		return quantity;
//	}
//	/**
//	 * @param quantity the quantity to set
//	 */
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	/**
//	 * @return the size
//	 */
//	public char getSize() {
//		return size;
//	}
//	/**
//	 * @param size the size to set
//	 */
//	public void setSize(char size) {
//		this.size = size;
//	}
//	/**
//	 * @return the author
//	 */
//	public String getAuthor() {
//		return author;
//	}
//	/**
//	 * @param author the author to set
//	 */
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	/**
//	 * @return the color
//	 */
//	public String getColor() {
//		return color;
//	}
//	/**
//	 * @param color the color to set
//	 */
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	//Constructors 
//	
//Product(String name, double price, String category, int quantity, char size, String author, String color){
//	this.name = name;
//	this.price = price;
//	this.category = category;
//	this.quantity = quantity;
//	this.size = size;
//	this.author = author;
//	this.color = color; 
//	
//}
//Product(String name, double price, String category, int quantity, String author){
//	this.name = name;
//	this.price = price;
//	this.category = category;
//	this.quantity = quantity;
//	this.author = author;
//}
//Product(String name, double price, String category, int quantity, char size, String color){
//	this.name = name;
//	this.price = price;
//	this.category = category;
//	this.quantity = quantity;
//	this.size = size;
//	this.color = color; 
//}
//
//Product(String name, double price, String category, int quantity){
//
//	this.name = name;
//	this.price = price;
//	this.category = category;
//	this.quantity = quantity;
//}



	boolean buy(){
		if(this.quantity > 0 ){
			 this.quantity -- ;
			return true;
		}
		else{
			return false;
		}
	
}


//	public String name() {
//		// TODO Auto-generated method stub
//		return 0;
//	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



//
//	public String toString(){
//	return("name"+this.name+"\n"+"price"+this.price+"\n"+"category"+this.category+"\n"+
//			"quantity"+this.quantity+"\n"+"size"+this.size+"\n"+"author"+this.author+"\n"+"color"+this.color+"\n" );
//}

}
