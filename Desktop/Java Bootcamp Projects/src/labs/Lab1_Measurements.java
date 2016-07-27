package labs;

import java.util.*;

public class Lab1_Measurements {

public static void main(String[] args) {

		     // display a welcome message
		     System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		     System.out.println();
       
		     Scanner scanner = new Scanner(System.in);
		     String choice = "y";
		     while (choice.equalsIgnoreCase("y"))		        
		        	{

		     // area = length * width
		     // perimeter = 2 * (length + width)
		        	
		     double length = 0;
		     double width = 0;
		     double area = 0;
		     double perimeter = 0;
		        	
		        	
		        	
		     System.out.print("Enter length of rectangle: ");
		     length = scanner.nextDouble();

		     System.out.print("Enter width of rectangle: ");
		     width = scanner.nextDouble();

		            
		     area = length * width;
		     perimeter = 2 * (length + width);
		           
		     System.out.println("The area of the rectangle is: " + area);
		     System.out.println("The perimeter of rectangle is:" + perimeter);
		           
 
		           
		     // see if the user wants to continue
		     System.out.print("Continue?(y/n): ");
		     choice = scanner.next();
		     System.out.println();
		     }
		     scanner.close();
		     System.out.println("Bye!");
		        	
	}	

	
}
