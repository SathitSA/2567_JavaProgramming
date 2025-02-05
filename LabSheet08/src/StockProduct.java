import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[] product = new Product[4];
		
		
		
		for(int i=0;i<4;i++) {
			product[i] =new Product();
			System.out.print("Input product Id   : ");
			product[i].setId(scan.nextLine()); 
			System.out.print("Input product Unit   : ");
			product[i].setUnit(scan.nextInt());
			scan.nextLine();
			while(true) {
				if(product[i].getUnit() > 0) {
					break;
				}
				System.out.print("Input product Unit,again(product Unit must more than 0)   : ");
				product[i].setUnit(scan.nextInt());
				scan.nextLine();
			}
			System.out.print("Input product price   : ");
			product[i].setPrice(scan.nextDouble());
			scan.nextLine();
			while(true) {
				if(product[i].getPrice() > 0) {
					break;
				}
				System.out.print("Input product price,again(product price must more than 0)   : ");
				product[i].setPrice(scan.nextDouble());
				scan.nextLine();
			}
			System.out.println();
			
		}
		
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println("Product ID : "+product[i].getId()+", Total price = "+String.format("%.2f",product[i].calculate())+" bath.");
		}
		System.out.println("-----------------------------------------------------");
		System.out.println();
		double totalPrice = 0;
        for (int i = 0; i < 4; i++) {
            totalPrice += product[i].calculate();
        } 
        System.out.println("Total price of all product is "+ String.format("%.2f",totalPrice) + " bath.");
		
	}

}