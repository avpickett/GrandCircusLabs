package Week6Labs;

public class ProductDB {

	public static Product getProduct (String productCode) { // static method
		
	//create the Product Object
	Product product = new Product();
	//fill the Product object with data
	product.setCode(productCode);
	if (productCode.equalsIgnoreCase("java")) {
			product.setDescription("Marach's Java Programming");
			product.setPrice (57.50);
	} else if (productCode.equalsIgnoreCase("jsp")) {
		 	product.setDescription("Marach's Servlets and JSP");
		 	product.setPrice(57.50);
	} else if (productCode.equalsIgnoreCase("mysql")) {
			product.setDescription("Marach's MYSQL");
			product.setPrice(54.50);
	} else if (productCode.equalsIgnoreCase("android")) {
			product.setDescription("Marach's Android Programming");
			product.setPrice(54.50);
	} else { 
		product.setDescription("Unknown");
	} 
	return product;

}
}
