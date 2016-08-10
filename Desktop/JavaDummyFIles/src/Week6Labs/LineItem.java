package Week6Labs;

import java.text.NumberFormat;

public class LineItem {

	
	
	private Product product;
	private int quantity;
	
	public LineItem() {
		this.product = null;				
		this.quantity = 0;	
	}
	public LineItem(Product product, int quantity) {
		this.product = product;				
		this.quantity = quantity;
	}
	
	// the set and get methods for the code variables
	public void setProduct (Product product) {
		this.product = product;
	}
	public  Product getProduct() {
		return product;
	}
	
	//the set and get method for the quantity variables 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	//the set and get methods for the price variables 
			public double getTotal() {
				double total = quantity * product.getPrice();
				return total;
			}
			//a custom get method for the price variable
			public String getPriceFormatted() {
				double total = this.getTotal();
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String priceFormatted = currency.format(total);
				return priceFormatted;
			
	
	}
	

}