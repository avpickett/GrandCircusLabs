package labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab10_MovieList {
	
	    public static void main(String[] args)  

	    {
	        System.out.println("Welcome to the Movie List Application");
	        System.out.println();
	        System.out.println("There are 100 movie in the list");
	        System.out.println();
	        System.out.print("What category are you interested in?" );
 	        System.out.println();
 	       
	        Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        while(choice.equalsIgnoreCase("y")) {
	        	 
	        ArrayList<String> animated = new ArrayList<>();
	         animated.add("Robot Chicken");
	         animated.add("Family Guy");
	         animated.add("American Dad");
	         animated.add("Bob's Burgers");
	         animated.add("The Simpsons");


	         ArrayList<String>drama = new ArrayList<>();
	         drama.add("John Q");
	         drama.add("The Green Mile");
	         drama.add("The Breakfast Club");
	         drama.add("The Shawshank Redemption");
	         drama.add("Braveheart");

	         ArrayList<String> horror = new ArrayList<>();
	         horror.add("Scream");
	         horror.add("Carrie");
	         horror.add("Insideous");
	         horror.add("Insideous");
	         horror.add("Sinister");

	         ArrayList<String> scifi = new ArrayList<>();
	         scifi.add("The Book of Eli");
	         scifi.add("Daybreakers");
	         scifi.add("Hunter Prey");
	         scifi.add("Predators");
	         scifi.add("Skyline");

	        
	       
	            
	                        String movielist = sc.nextLine();
	                    switch (movielist) {
	                        case "animated":
	                            System.out.println(animated);
	                            break;
	                        case "drama":
	                            System.out.println(drama);
	                            break;
	                        case "horror":
	                            System.out.println(horror);
	                            break;
	                        case "scifi":
	                            System.out.println(scifi);
	                            System.exit(0);
	                            break;
	                    }
	                            
	                        
	                  		          
	                    
	        // see if the user wants to continue
 		    System.out.print("Continue?(y/n): ");
 		   System.out.println();
 		     //choice = sc.next("Bye!);     
	       
  		                       
}
	        //sc.close();
 		     //System.out.println("Bye!"); 
	        }}