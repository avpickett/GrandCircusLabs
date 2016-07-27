package labs;

import java.util.*;
import java.util.Scanner;

public class Lab6_Translator {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
        /*Scanner sc = new Scanner(System.in);
        String word; // original word
        String latin = "";  // pig latin translation, init to empty string
        char first;
        boolean cap = false;
        String line;
     
     // display a welcome message
	     System.out.println("Welcome to the Pig Latin Translator!");
	     System.out.println();
	     
	     System.out.print("enter line to translate: ");
        line = sc.nextLine();
     	sc = new Scanner(line);
     	
     	// loop through all the words in the line
     	String choice = "y";
        while (choice.equalsIgnoreCase("y"))	// is there another word?
        {
           word = sc.next();
           first = word.charAt(0);
           if ('A' <= first && first <= 'Z')  // first is capital letter
           {
              first = Character.toLowerCase(first);
              cap = true;
           }
           else{
        		cap = false;
           }
        // test if first letter is a vowel
           if (first=='a' || first=='e' || first=='i' || first=='o' || first=='u'){
              latin = word + "hay";
           }
           //else  // not a vowel
           
              if (cap)
              {
                 latin = "" + Character.toUpperCase(word.charAt(1));  // char to String conversion
                 latin = latin + word.substring(2) + first + "ay";
              }
              else{
                 latin = word.substring(1) + first + "ay";
           }
        
           System.out.print(latin + " ");
        } // end of loop to process one word
        
        System.out.println("Continue?(y/n): " );
	     choice = sc.next();
	     System.out.println(); 
     }
	  
	  
	  
  }	*/	

 // display a welcome message
	     System.out.println("Welcome to the Pig Latin Translator!");
	    System.out.println("Enter word: ");
	     System.out.println();
	     
	     String convertToPigLatin = "";
	     String choice = "y";
	while (choice.equalsIgnoreCase("y")){
	     
	    
	    //System.out.println("Enter word: ");
		//System.out.println();
	     
	     String word = scanner.nextLine();
	    
	       char v = Character.toLowerCase(word.charAt(0));
	        
	       
	        for (int i = 0; i < word.length(); i++){ 
	        
		         v = Character.toLowerCase(word.charAt(0));

	  		
	        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
	        {
	            convertToPigLatin = word + "way";
	        }
	        else
	        {
	            String first = word.substring(0,1);
	            String slice = word.substring(1,word.length());
	            convertToPigLatin = slice + first + "ay";
	        }
	        }
            System.out.println(convertToPigLatin);

	        

	  // see if the user wants to continue
	     System.out.print("Translate another line?(y/n): ");
	     choice = scanner.nextLine();
	     System.out.println();
		
	}
		
	   
	scanner.close();
     System.out.println("Bye!");    	        
	     }
	    
	        	
	}


