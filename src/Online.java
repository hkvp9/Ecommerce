import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Online {
	
	static double totalAmount = 0.0;
	static int userinput = 9;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> items = new ArrayList<Product>();

	public static void main(String[] args) {
		
		//Apparel(String name, double price, int quantity, char size, String color)
		items.add(new Apparel("Business Ritual Women’s Long Sleeve Top", 65.39, 4, 'L', "Blue"));
		
		//(String name, double price, int quantity, String Author, String Genre, String Isbn
		items.add(new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Education", "9788-429-1266-48"));
		
		//Apparel(String name, double price, int quantity, char size, String color)
		items.add(new Apparel("Men’s Business Casual Shirt", 57.10, 2, 'M', "Teal"));
		
		//public Bath(String name, double price, int quantity)
		items.add(new Bath("Organic Turmeric Soap", 11.25, 1));
		
		//String Author, String name, double price, int quantity)
		items.add(new Book("Head First Design Pattern","Eric Freeman", 37.35, 3));
		
		while (true) {
			System.out
					.println("Enter the product number (0 to 4) you want to buy."
							+ "To exit the shopping cart, enter any number other than 0 to 4");
			for (int x = 0; x < items.size(); x++) {
				System.out.println(x + ":" + items.get(x).getName());}
			try {
	
				userinput = sc.nextInt();
				if (items.get(userinput).buy()) {
					System.out.println("Your purchase was successful ");
					totalAmount += items.get(userinput).getPrice();
				} else {
					System.out.println("Sorry! This product is out of stock.");
					System.out.println("Thank you for shopping with us! The total amount is "+ totalAmount);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, exiting the shopping cart." +totalAmount);
				break;
			}
			catch( IndexOutOfBoundsException e){
				System.out.println("Array index out of bounds - Total amount is "+"\n" + totalAmount );
				break;
			} 
				
		
	}
		sc.close();

		
		
	}
}
