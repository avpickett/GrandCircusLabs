package labs;

import java.util.*;

public class Lab5_DiceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		        String choice = "y";
		        int die1=1;
		        int die2=1;
		        int count=0;
		        
		        System.out.println("Welcome to the Grand Circus Casino!");
		        System.out.println("Roll the dice? (y/n):" );
		        choice = sc.nextLine();
		        
		        while (choice.equalsIgnoreCase("y")) {
		                        	
		            //Roll the Dice
		            die1 = (int) (Math.random() * 6 + 1);
		            die2 = (int) (Math.random() * 6 + 1);
		            count++;
		            
		            //Display the results
		            System.out.println("Roll " + count +":");            
		            System.out.println(die1);           
		            System.out.println(die2);
		            
		            // see if the user wants to continue
		            System.out.print("Roll Again(y/n):");
		            choice = sc.nextLine();
		            
		        } //while
		        sc.close();
		        System.out.println("thanks!");
		    	
		    } 
		} 

			


