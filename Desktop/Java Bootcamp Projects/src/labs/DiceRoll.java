package labs;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args){
		Scanner  scanner = new Scanner(System.in);
		String choice;
		String rollAgain;
		int value = 0;
		int value2 = 0;
		Random randomValue = new Random();
		
	
	// display a welcome message
    System.out.println("Welcome to Grand Circus Casino! Roll the Dice! (y/n): ");
    choice = scanner.nextLine();
 
   
    
	do{
    	if (choice.equalsIgnoreCase("y"))	{
    		value = randomValue.nextInt(6);
    		value2 = randomValue.nextInt(6);
    		if (value==0)
    			{value=1;}
    		if (value2==0)
    			{value2=1;}
    		System.out.println("Roll: " + value + " & " + value2);
    	}  else {
    		System.out.println("Game Over!");
    	}	choice = scanner.nextLine();	
    	     
     
    	// see if the user wants to continue
    	System.out.println("Roll Again?(y/n): "); 
    	rollAgain = scanner.nextLine();
    	
	
	} while (rollAgain.equals("y"));
	 System.out.println("Game Over");
	
	
	
     }
	
}