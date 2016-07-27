package labs;

import java.util.*;

public class DummyMidterm {

	public static void main(String[] args) {
        
        String name;
        String payment;
        int soap;
        int deodorant;
        int toothpaste;
        int bubbleBath;
        int perfume;
        int bathFizz;
        int footScrub;
        int bodyOil;
        int conditioningShampoo;
        int faceMoisterizer;
        int bodyButter;
        int conditoner;
        int quantity = 0;
        double subtotal;
        double salesTax;
        double grandTotal;
        double lineTotal;
        double cash;
        double check;
        double creditCard;
        double price;
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Company Name");
        System.out.println();
    
        System.out.println("Menu Price and Product Description");
        System.out.println();
        System.out.println("001)Deodorant $7");
        System.out.println("All Natural, GMO Free, No Paraban, No Aluminum");
        System.out.println();
        System.out.println("002)Moisturizing Soap $4");
        System.out.println("Goat Milk, Lavendar Scented Body and Face Soap. Great for Sensitive Skin!");
        System.out.println();
        System.out.println("003)Body Oil $12");
        System.out.println("A mixture of our Exclusive Oils, Non GMO, No Animal By Products");
        System.out.println();
        System.out.println("004)Body Butter $15");
        System.out.println("Whipped Shea Butter, Coconut Oil, Almond Oil");
        System.out.println();
        System.out.println("005)Bubble Bath $20");
        System.out.println("Strawberry Milk");
        System.out.println();
        System.out.println("006)Bath Fizz $3");
        System.out.println("Rejuvinating Bath Bomb");
        System.out.println();
        System.out.println("007)Conditioning Shampoo $9");
        System.out.println("For Natural and Processed Hair");
        System.out.println();
        System.out.println("008)Almond Butter Condition $9");
        System.out.println("For Natural and Processed Hair");
        System.out.println();
        System.out.println("009)Perfume $25");
        System.out.println("Warm Kisses");
        System.out.println();
        System.out.println("010)Foot Scrub $12");
        System.out.println("Warm Sugar Scrub");
        System.out.println();
        System.out.println("011)Face Moisturizer $8");
        System.out.println("A Hint of Black Seed Oil");
        System.out.println();
        System.out.println("012)Toothpaste $7");
        System.out.println("No Aluminum");
        System.out.println();
        
      //salesTax = subtotal * Sales Tax Percentage (use 6.0% for the sales tax percentage)
    
        while(true) {
            
            System.out.println("Would You like to Place Your Order (yes or no)");
            String shop = sc.nextLine();
        
        if (shop.equalsIgnoreCase ("yes")){
                
        //if (quantity > 0){
            System.out.println("Please select Item");
            int choice = sc.nextInt();
            
            System.out.print("Please select quantity");
            int order = sc.nextInt();
            System.out.println();
            
            
            System.out.println("Enter Payment Method");
            String paymentMethod = sc.nextLine();
            String amount = sc.nextLine();
            paymentMethod.equalsIgnoreCase(paymentMethod);
            
                if (paymentMethod.equalsIgnoreCase("Cash")){
                    System.out.println("Enter purchase price:");
                    amount = sc.nextLine();
                }
                else if (paymentMethod.equalsIgnoreCase("Credit Card")){
                    System.out.println("Enter Credit Card Number, Expiration Date and CCV");
                    }
                
                    else if (paymentMethod.equalsIgnoreCase("Check")) {
                    System.out.println("Enter Check Number");
                    
            sc.close();        
                    }    
        } else {
            //System.out.println("Quantity must be greater than 0");
            
        
        
        
        
        }
        
    }    
}
}
