import java.util.*;
import java.text.*;
public class JavaClassLab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat();
		
		System.out.print("input Product name    : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product unit    : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Price per unit  : ");
		float productPrice = input.nextFloat();
		
		
		System.out.println("---------------------------------------------------");
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct) +" baht");
		System.out.println("---------------------------------------------------");
		System.out.print("how many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("---------------------------------------------------");
		double totalDiscount = totalPriceofProduct*discount/100;
		double endDiscount = totalPriceofProduct - totalDiscount;
		System.out.println("Discount form "+ discount +"%       "+frm.format(totalDiscount) +" baht");
		System.out.println("Amount to be paid      " + frm.format(endDiscount)+" baht");
		
		
		
		input.close();
	}

}
