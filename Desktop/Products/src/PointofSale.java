import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PointofSale {

	public static void main(String[] str) throws IOException {

		Scanner sc = new Scanner(System.in);

		// Create a BufferedReader from a FileReader.
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ap_mo\\Desktop\\PointofSale.txt"));
		
		

			// Loop over lines in the file and print them.
			ArrayList<Product> products = new ArrayList<Product>();
			String line = ("");
			while ((line = reader.readLine()) != null) {
				line = reader.readLine();

				ArrayList <String> product=new ArrayList <String>();

				Product p = new Product();
				
				p.setName(line.split(",")[0]);
				p.setPrice(Double.parseDouble((line.split(",")[1])));
				p.setDescription(line.split(",")[2]);
				p.setCategory(line.split(",")[3]);
				products.add(p);
							
			}
		String [] productCodes = {"0", "1", "2", "3"};
		System.out.println(productCodes);
			
			
		
		System.out.println("Would You Like To Browse Our Catalog");
			
			String choice = sc.nextLine();
			Object String;
			if (choice.equalsIgnoreCase("y")){
		
				for (Product p : products ){
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getDescription());
			System.out.println(p.getCategory());
				}	
			  
	        String deodorant;
	        String soap;
	        String toothpaste;
	        String bubbleBath;
	        String perfume;
	        String bathFizz;
	        String footScrub;
	        String bodyOil;
	        String conditioningShampoo;
	        String faceMoisterizer;
	        String bodyButter;
	        String conditoner;	
		 
					
			
			
			if (choice.equalsIgnoreCase("y"));
		
			}
			System.out.println("Select an item");
			
			String productItem = sc.nextLine();
			
			switch (productItem) {
				case "deodorant":
					break;
				case "soap":
					break;
				case "oil":
					break;
				case "body butter":
					break;
				case "bubble bath":
					break;
				case "bath fizz":
					break;
				case "shampoo":
					break;
				case "conditioner":
					break;
				case "perfume":
					break;
				case "foot scrub":
					break;
				case "face moisturizer":
					break;
				case "toothpaste":
					break;
					}
			

System.out.println("You Added   " + productItem + "To your cart");
	

System.out.println("Please enter your quantity.");
int quantity3 = Integer.parseInt(sc.nextLine());


//System.out.println("Select an Item");
//System.out.println(p.getName());
//	
//System.out.println(p.getPrice());
//	System.out.println(p.getDescription());
//	System.out.println(p.getCategory());


String quantity;
double price=0;
for (Product p : products ){
	if (p.getName().equals(productItem))
		price=p.getPrice();
}
double total = quantity3 * price;
double total2;
double total3;
//double grandTotal = total + total2 + total3;
double salesTax = total*(.0625);
double grandTotalTaxed = total + salesTax;


String amount = "Quantity:";
String amount1 = "Price";
String amount2 = "Total";
String taxSign = "%";

System.out.printf("\nYour bill:");
System.out.printf("\n\nItem: "+ productItem);
System.out.printf("%30s", amount + quantity3);
//       System.out.printf("\n%s %25d %16.2f %11.2f", item, quantity, price, total);
//       System.out.printf("\n%s %25d %16.2f %11.2f", item2,quantity2, price2, total2);
//       System.out.printf("\n%s %25d %16.2f %11.2f", item3,quantity3, price3, total3);

Object item;
//System.out.printf("\n%30s", item);
//System.out.printf("%30d", quantity);
Object item2;
//System.out.printf("\n%30s", item2);
Object item3;
//System.out.printf("\n%30s", item3);



System.out.printf("\n\n\nSubtotal %47.2f", total);
System.out.printf("\n6.25 %s sales tax %39.2f", taxSign, salesTax);
System.out.printf("\nTotal %50.2f", grandTotalTaxed);




	}
}

//String paymentMethod = sc.nextLine();
//
//System.out.println("Enter Payment Method");
//String purchse = sc.nextLine();
//paymentMethod.equalsIgnoreCase(paymentMethod);
//
//if (paymentMethod.equalsIgnoreCase("Cash")) {
//	System.out.println("Enter purchase price:");
//	purchse = sc.nextLine();
//} else if (paymentMethod.equalsIgnoreCase("Credit Card")) {
//	System.out.println("Enter Credit Card Number, Expiration Date and CCV");
//}
//
//else if (paymentMethod.equalsIgnoreCase("Check")) {
//	System.out.println("Enter Check Number");
//
//				}
//		}		
//	}
//	}
//}
////		System.out.println(line.split(",")[0]);
////			
////		System.out.println(line.split(",")[1]);
////			
////		System.out.println(line.split(",")[2]);
////			
////		System.out.println(line.split(",")[3]);
//			
////	} else if (choice.equalsIgnoreCase("Please Select Item")){
////				
////			
////	}
////			}
////			
////	}
////}
////			//System.out.println("Please select Item");
////			//int product = sc.nextInt();
//
//			//System.out.println("Please select quantity");
//			//int order = sc.nextInt();
//			//System.out.println();
//		
//			//for (int i = 0; i < products.size(); i++){
//				//String name  = Product.getName();
//				//System.out.println(name);
//	
//
//		/*	String choice = sc.nextLine();
//			
//			while (choice.equalsIgnoreCase("y")) {
//			
//			System.out.println(x);
//			System.out.println(products);
//			
//			
//				
//			break;*/
//	
//	
//
//		//while (true){
//			//
//			
//
///*
//			System.out.println("Please select Item");
//			int product = sc.nextInt();
//
//			System.out.println("Please select quantity");
//			int order = sc.nextInt();
//			System.out.println();
//
//*/
//		/*	System.out.println("Enter Payment Method");
//			String paymentMethod = sc.nextLine();
//			String amount = sc.nextLine();
//			paymentMethod.equalsIgnoreCase(paymentMethod);
//
//			if (paymentMethod.equalsIgnoreCase("Cash")) {
//				System.out.println("Enter purchase price:");
//				amount = sc.nextLine();
//			} else if (paymentMethod.equalsIgnoreCase("Credit Card")) {
//				System.out.println("Enter Credit Card Number, Expiration Date and CCV");
//			}
//
//			else if (paymentMethod.equalsIgnoreCase("Check")) {
//				System.out.println("Enter Check Number");
//
//			}
//
//		*/
//	
	