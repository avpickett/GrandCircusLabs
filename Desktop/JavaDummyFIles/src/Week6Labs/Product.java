package Week6Labs;

import java.text.NumberFormat;

public class Product {
	
		//the instance variables 
		private String code;
		private String description; 
		private double price; 
		
		
		//The constructor
		public Product() {
			code = "";
			description = "";
			price = 0 ;
				
		} //close constructor
		
		// the set and get methods for the code variables
		public void setCode(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		
		//the set and get method for the description variables 
		public void setDescription(String description){
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		//the set and get methods for the price variables 
				public void setPrice(double price){
					this.price = price;
				}
				public double getPrice() {
					return price;
				}
		

		//a custom get method for the price variable
		public String getPriceFormatted() {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String priceFormatted = currency.format(price);
			return priceFormatted;
		
		} //main

	} //class