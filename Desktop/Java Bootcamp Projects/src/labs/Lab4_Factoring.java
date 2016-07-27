package labs;

import java.util.*;

public class Lab4_Factoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// display a welcome message
	     System.out.println("Welcome to the Factorial Calculator!");
	     System.out.println();
	     
	     
	     Scanner scanner = new Scanner(System.in);
	     String choice = "y";
	     while (choice.equalsIgnoreCase("y"))	
	    	  {	 
     int n, c, fact = 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+n+" is = "+fact);
         
         // see if the user wants to continue
	     System.out.print("Continue?(y/n): ");
	     choice = scanner.next();
	    
	     
	     //scanner.close();
	    
      } 
	     System.out.println("Bye!");
   }
	
}