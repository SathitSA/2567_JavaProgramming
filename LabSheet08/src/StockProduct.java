import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[] product = new Product[4];
		
		
		
		for(int i=0;i<=4;i++) {
			product[i] =new Product();
			System.out.print("Input product Id   : ");
			product[i].setId(scan.nextLine()); 
			System.out.print("Input product Unit   : ");
			product[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.print("Input product price   : ");
			product[i].setPrice(scan.nextDouble());
			scan.nextLine();
			System.out.println();
			
		}
		
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<=4;i++) {
			System.out.println("Product ID : "+product[i].getId()+", Total price = "+product[i].calculate()+" bath.");
		}
		System.out.println();
		
		
	}

}
