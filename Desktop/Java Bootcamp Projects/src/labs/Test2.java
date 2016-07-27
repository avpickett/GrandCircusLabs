package labs;
import java.util.Scanner;
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare Variables
        Scanner input = new Scanner(System.in);
        String sCustomerName ="";   //Stores the Customer's Name
        int nSelection = 0;         //Stores the value entered by the user
        int nSum = 0;               //Stores sum of values entered
        int nCount = 0;             //Number of values entered
        int nPrice = 0;

        //Declare Constants
        final int SENTINEL = 10; //Used to end loop

        //Promt User to enter the their name.
        System.out.print("Please enter the your name: ");
        //Read Customer Name input from user
        sCustomerName = input.nextLine( );    

        //Print to Blank Line for spacing
        System.out.println("\n");

        //Print Purchase Menu
        System.out.println("BEST PURCHASE PRODUCTS:");
        System.out.println("1. Smartphone..........$249");
        System.out.println("2. Smartphone Case.... $39");
        System.out.println("3. PC Laptop...........$1149");
        System.out.println("4. Tablet..............$349");
        System.out.println("5. Tablet Case.........$49");
        System.out.println("6. eReader.............$119");
        System.out.println("7. PC Desktop..........$889");
        System.out.println("8. LED Monitor.........$299");
        System.out.println("9. Laser Printer.......$399");
        System.out.println("10.Complete my order");

        //Print to Blank Line for spacing
        System.out.println("\n");

        while (nSelection != SENTINEL) {

            //Calculate sum
            nSum = nPrice + nSum;

            //Increment counter
            nCount++; //or nCount = nCount + 1;

            //Promt User to enter the an item from the menu.
            System.out.print("Please enter item from the menu above: ");
            //Read input from user for selected purchase
            nSelection = input.nextInt();

            if (nSelection == 1) {

                nPrice = 249;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 2 ) {

                nPrice = 39;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 3 ) {

                nPrice = 1149; 

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 4 ) {

                  nPrice = 349;

                  //Promt User to enter the an item from the menu.
                  System.out.print("Please enter another item from the menu above: ");
                  //Read input from user for selected purchase
                  nSelection = input.nextInt();
            }
            else if (nSelection == 5 ) {

                nPrice = 49;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 6 ) {

                nPrice = 119;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 7 ) {

                nPrice = 899;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
            else if (nSelection == 8 ) {

                nPrice = 299;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }  
            else if (nSelection == 9 ) {

                nPrice = 399;

                //Promt User to enter the an item from the menu.
                System.out.print("Please enter another item from the menu above: ");
                //Read input from user for selected purchase
                nSelection = input.nextInt();
            }
        }//end while user did not enter 10

        //Print blank line
        System.out.println();

        //Print Thank You message
        System.out.println("Thank you for ordering with Best Purchase,"+sCustomerName);
        //Print number of integers entered
        System.out.println("Total Items Ordered: " + nCount);
         //Print number of integers entered
        System.out.println("Total: $" + nSum);  
    }//end main class
}//end public class