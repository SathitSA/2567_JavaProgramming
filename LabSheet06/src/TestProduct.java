import java.util.*;
public class TestProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Product pd1 = new Product();
		
		System.out.print("Enter product name: ");
		String nameProduct =scan.next();
		System.out.print("Enter product price: ");
		double priceProduct = scan.nextDouble();
		System.out.print("Enter VAT rate(%): ");
		double vatRate = scan.nextDouble();
		
		pd1.setproductDetails(nameProduct, priceProduct, vatRate);
		System.out.println();
		pd1.displayProductDetail();

	}

}
