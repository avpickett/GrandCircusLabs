import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PointofSale {

	public static void main(String[] str) throws IOException{
		// TODO Auto-generated method stub

	
Scanner sc = new Scanner(System.in);

        // Create a BufferedReader from a FileReader.
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ap_mo\\Desktop\\PointofSaless.txt"));

        // Loop over lines in the file and print them.
        ArrayList<Product> products = new ArrayList<Product>();
        String line;
        
        while ((line = reader.readLine()) != null) {
        	
            //line = reader.readLine();
        	//System.out.println(line.trim());
            //ArrayList <String> parts=new ArrayList <String>();

            Product p = new Product();

            p.setName(line.split(",")[0]);
            p.setPrice(Double.parseDouble((line.split(",")[1])));
            p.setDescription(line.split(",")[2]);
            p.setCategory(line.split(",")[3]);
            products.add(p);

        }

        System.out.println("Would You Like To Browse Our Catalog (y/n)");
        System.out.println();
        String choice = sc.nextLine();
        Object String;
        if (choice.equalsIgnoreCase("y")) {

            for (Product p : products) {
                System.out.println(p.getName());
                System.out.println(p.getPrice());
                System.out.println(p.getDescription());
                System.out.println(p.getCategory());
            }

        }
        System.out.println("Select an item");
        String productItem = sc.nextLine();
        System.out.println();
        
        System.out.println("You Added " + productItem + " To your wishlist");

        System.out.println("Please enter your quantity.");
        int quantity3 = Integer.parseInt(sc.nextLine());
        System.out.println();
        
        String quantity;
        double price = 0;
        for (Product p : products) {
            if (p.getName().equals(productItem))
                price = p.getPrice();
        }
    
        double total = quantity3 * price;
        double salesTax = total * (.0625);
        double grandTotalTaxed = total + salesTax;

        String amount = "Quantity:";
        String taxSign = "%";

        System.out.printf("\nYour bill:");
        System.out.printf("\n\nItem: " + productItem);
        System.out.printf("%30s", amount + quantity3);

        System.out.printf("\n\n\nSubtotal %47.2f", total);
        System.out.printf("\n6.25 %s sales tax %39.2f", taxSign, salesTax);
        System.out.printf("\nTotal %50.2f", grandTotalTaxed);

    

}

}

/*String paymentMethod = sc.nextLine();

System.out.println("Enter Payment Method");
String purcahse = sc.nextLine();
paymentMethod.equalsIgnoreCase(paymentMethod);

if (paymentMethod.equalsIgnoreCase("Cash")) {
System.out.println("Amount Due: " + amount);}

else if (paymentMethod.equalsIgnoreCase("Credit Card")) 
System.out.println("Enter Credit Card Number, Expiration Date and CCV");

//} else  (paymentMethod.equalsIgnoreCase("Check"){
System.out.println("Enter Check Number");
*/

