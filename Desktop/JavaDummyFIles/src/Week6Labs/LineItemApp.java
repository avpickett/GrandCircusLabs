package Week6Labs;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

	public static void main(String args[]) {
			System.out.println("Welcome to the Line Item Calculator");
			
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			while (choice.equalsIgnoreCase("y")){
				
				Product product = new Product();
				LineItem line = new LineItem();
				ProductDB ifstate = new ProductDB();
				
				//get input from user
				System.out.print("Enter product code: ");
				String productCode = sc.nextLine();
				
				System.out.print("Enter quantity:		");
				int quantity = Integer.parseInt(sc.nextLine());
				sc.nextLine(); // force end of line charc - work around for parseInt method
			
				// set product price based on the product code
				double price;
				String description = "";
				if (productCode.equalsIgnoreCase("java")) {
						price = 57.50;
						description = "Marach's Java Programming";
					} else if (productCode.equalsIgnoreCase("jsp")) {
						price = 57.50;
						description = "Marach's JSP Programming";
					} else if (productCode.equalsIgnoreCase("mysql")) {
						price = 54.50;
						description = "Marach's MYSQL Programming";
					} else if (productCode.equalsIgnoreCase("android")) {
							price = 51.50;
							description = "Marach's ANDROID Programming"; 
					} else { 
							price = 0;
							description = "Marach's Programming";
					} 
				//calculate total
				double total = price * quantity; 
				
				//format and display output
				NumberFormat currency =  NumberFormat.getCurrencyInstance();
				//String priceFormatted = currency.format(price);
				//String totalFormatted = currency.format(total);
				String message = "\nLINE ITEM\n" + 
						"Code:  	"	+ productCode	+ 	"\n"	+	
						"Description:  "+ description	+ 	"\n"	+
						"Price: 	"	+ currency.format(price) +	"\n"	+
						"Quantity: 	"	+ quantity	+ 	"\n"	+			
						"Total: 	"	+ currency.format(total)	+ 	"\n"  ;
				System.out.println(message);
			
				//see if the user wants to continue
				System.out.print("Continue? (y/n):	");
				choice = sc.nextLine();
				System.out.println();
			}
			sc.close();
			System.out.println("Bye!");
			} //main brace
		} //class brace
