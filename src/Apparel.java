
public class Apparel extends Product {
	
	private char size;
	private String color;
	
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
	}
	
	
	@Override
	public void getDetails() {
		System.out.println(" We sell different kinds of business clothes for both men and women ");
	}



	public char getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(char size) {
		this.size = size;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	
	
	
}
