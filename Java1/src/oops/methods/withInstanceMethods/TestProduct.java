package oops.methods.withInstanceMethods;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.productName="candy";
		p.productColor="red";
		p.productSize=1;
		p.productBrand="Nestle";
        p.productPrice=100;
        p.productDiscount=10;
        p.finalPrice();
	}

}
