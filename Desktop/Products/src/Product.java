import java.util.Scanner;
import java.sql.Array;
public class Product{
	
	String category;
	
	void setCategory (String c){
		category = c;
	}
	
	String getCategory(){
		return category;
	}
    String name;  

    void setName (String n) {  
      name = n;  
    }  

     String getName() {  
       return name;  
    }  

	
    
	String description;  

    void setDescription (String d) {  
      description = d;  
    }  

    String getDescription() {  
       return description;  
    }  

   
	       double price;  

	       void setPrice (double p) {  
	         price =  p;  
	      
	       }  

	       double getPrice() { 
	          return price;  
	       }  
	
	

	Product (){
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;		
		
	}
	
}
