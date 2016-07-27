package labs;

import java.util.Scanner;

public class lab8_BattingAverage {

	public static void main(String[] args) {
		
	
		String name;
		
		int  hits;
		int singles;
		int doubles;
		int triples;
		int homeruns;
		int walks;
		int at_bats;
		
		double batting_average;
		double slugging_average;
		double on_base_percentage;
		
		Scanner sc=new Scanner(System.in);
		String choice = "y";
		
		while (true) {
		System.out.print("Welcome to Batting Average Calculator!: ");	
		Scanner keyboard=new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter number of times at bat: ");
		name=keyboard.nextLine();
		System.out.print("Enter the number of out ");
		hits=keyboard.nextInt();
		System.out.print("Enter the number of singles ");
		doubles=keyboard.nextInt();
		System.out.print("Enter the number of double ");
		triples=keyboard.nextInt();
		System.out.print("Enter the number of triple ");
		homeruns=keyboard.nextInt();
		System.out.print("Enter the number of home runs ");
		walks=keyboard.nextInt();
		System.out.print("Enter the number of at bats");
		at_bats=keyboard.nextInt();
		
		//Calculate the averages
				
		singles = (hits - homeruns - doubles - triples);
		batting_average = ( (double) hits /  at_bats);
		on_base_percentage = ((double) hits + walks)  / ((double) at_bats + walks);
		slugging_average= ((double) singles + 2 * doubles + 3 * triples + 4 * homeruns) / at_bats;
		
		//print out values
		
		System.out.println("Player" + name + "stats are as follows:");
		System.out.println("The number of singles is:" + singles);
		System.out.println("The batting average is:" + batting_average);
		System.out.println("The on base percentage is:" + on_base_percentage);
		System.out.println("The slugging average is:" + slugging_average);	
		
		// see if the user wants to continue
	     System.out.print("Another batter?(y/n): ");
	     choice = sc.nextLine();
	     System.out.println();
	     
	     if (choice.equalsIgnoreCase("n")){
	    	 sc.close();
	    	
	    	 System.out.println("thanks");
	     break;
	}
	     keyboard.close();	
	}
	
}}