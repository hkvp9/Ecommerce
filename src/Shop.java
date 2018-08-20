import java.util.InputMismatchException;
import java.util.Scanner;

//create scanner for user input

public class Shop {
	
	
	static final String questionOpen = "is the Shop open?";
	static boolean isShopOpen = true;
	static double totalAmount = 0.0;
	static int userinput = 9;
	static Scanner sc = new Scanner(System.in);
	Shop shop; 
//	static  Product[] shopping = new Product[5]; 
	static Product [] shopping = ]  { new ("Business Ritual Women's long sleeve top",
			65.39, "Apparel", 4, 'L', "blue") , new ("The Art of Computer Programming", 190.54,
			"Books", 9, "Donald E. Knuth") , ("Men's Business Casual Shirt", 57.10,
			"Apparel", 2, 'M', "Teal") , ("Organic Tumeric Soap", 11.25,
			"Bath & Beauty", 1) , ("Head First Design Pattern", 37.35, "Books",
					3, "Eric Freeman")} ;
//
//	shopping[0] = new Product("Business Ritual Women's long sleeve top",
//			65.39, "Apparel", 4, 'L', "blue");
//	shopping[1] = new Product("The Art of Computer Programming", 190.54,
//			"Books", 9, "Donald E. Knuth");
//	shopping[2] = new Product("Men's Business Casual Shirt", 57.10,
//			"Apparel", 2, 'M', "Teal");
//	shopping[3] = new Product("Organic Tumeric Soap", 11.25,
//			"Bath & Beauty", 1);
//	shopping[4] = new Product("Head First Design Pattern", 37.35, "Books",
//			3, "Eric Freeman");
//	

	
	public static void main(String[] args) {
		
		System.out.println(questionOpen);
		isShopOpen = sc.nextBoolean();

		
//		if (isShopOpen==true){
//			System.out.println("Enter the product number (0 to 4) you want to buy."
//					+ "To exit the shopping cart, enter any number other than 0 to 4");
		
	
	for (int x = 0; x < shopping.length; x++) {
		System.out.println(x + ":" + shopping[x].getName());
	}
	try {
		userinput = sc.nextInt();
	} catch (InputMismatchException e) {
		System.out.println("Invalid input, exiting the shopping cart." +totalAmount);
//		break;
	
	}
	if (userinput >= 0 && userinput <= 4) {
		if (shopping[userinput].buy()) {
			System.out.println("Your purchase was successful"+"Thank you for shopping with us! The total amount is "+ totalAmount);
			totalAmount += shopping[userinput].getPrice();
		} 
		else if(isShopOpen= ! false){
			System.out.println("Sorry the shop is closed!");
			
		}
	else {
				System.out.println("Thankyou for visiting!" +totalAmount);
			}



		sc.close();
		}

		}
	}


	
		

		
