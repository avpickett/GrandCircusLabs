package labs;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
	
		    Scanner kb = new Scanner(System.in);

		   //       System.out.printf("$%4.2f for each %s ", price, item);
		   //       System.out.printf("\nThe total is: $%4.2f ", total);

		    //process for item one
		    System.out.println("Please enter in your first item");
		    String item = kb.nextLine();
		    System.out.println("Please enter the quantity for this item");
		    int quantity = Integer.parseInt(kb.nextLine());
		    System.out.println("Please enter in the price of your item");
		    double price = Double.parseDouble(kb.nextLine());




		    //process for item two
		    System.out.println("\nPlease enter in your second item");
		    String item2 = kb.nextLine();
		    System.out.println("\nPlease enter the quantity for this item");
		    int quantity2 = Integer.parseInt(kb.nextLine());
		    System.out.print("\nPlease enter in the price of your item");
		    double price2 =Double.parseDouble( kb.nextLine());
		    double total2 = quantity2*price2;
		   //       System.out.printf("$%4.2f for each %s ", price2, item2);
		   //       System.out.printf("\nThe total is: $%4.2f ", total2);

		    //process for item three
		    System.out.println("\nPlease enter in your third item");
		    String item3 = kb.nextLine();
		    System.out.println("Please enter the quantity for this item");
		    int quantity3 = Integer.parseInt(kb.nextLine());
		    System.out.println("Please enter in the price of your item");
		    double price3 = Double.parseDouble(kb.nextLine());
		    double total3 = quantity3*price3;
		   //       System.out.printf("$%4.2f for each %s ", price3, item3);
		   //       System.out.printf("\nThe total is: $%4.2f ", total3);


		    double total = quantity*price;

		    double grandTotal = total + total2 + total3;
		    double salesTax = grandTotal*(.0625);
		    double grandTotalTaxed = grandTotal + salesTax;
r

		    String amount = "Quantity";
		    String amount1 = "Price";
		    String amount2 = "Total";
		    String taxSign = "%";

		    System.out.printf("\nYour bill: ");
		    System.out.printf("\n\nItem");
		    System.out.printf("%30s", amount);
		   //       System.out.printf("\n%s %25d %16.2f %11.2f", item, quantity, price, total);
		   //       System.out.printf("\n%s %25d %16.2f %11.2f", item2,quantity2, price2, total2);
		   //       System.out.printf("\n%s %25d %16.2f %11.2f", item3,quantity3, price3, total3);

		    System.out.printf("\n%30s", item);
		    System.out.printf("%30d", quantity);
		    System.out.printf("\n%30s", item2);
		    System.out.printf("\n%30s", item3);



		    System.out.printf("\n\n\nSubtotal %47.2f", grandTotal);
		    System.out.printf("\n6.25 %s sales tax %39.2f", taxSign, salesTax);
		    System.out.printf("\nTotal %50.2f", grandTotalTaxed);


	}

}
