package oops.methods.withInstanceMethods;
/*assignment
Product.java:
--------------------
productName
productColor
productSize
productBrand
productPrice
productDiscount

finalPrice()

Req: 
1.take the input for product details
2.find the final price
*/

public class Product {
	String productName;
	String productColor;
	int productSize;
	String productBrand;
	int productPrice;
	int productDiscount;
	
	public void finalPrice() {
		System.out.println("final price is"+ (productPrice-productDiscount));
	}
	

}
