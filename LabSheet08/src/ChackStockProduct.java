import java.util.*;
public class ChackStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many product list instocl : ");
		int listStock = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		
		Product[] product = new Product[listStock];
		
		for(int i=0;i<listStock;i++) {
			product[i] =new Product();
			System.out.print("Input product Id     : ");
			product[i].setId(scan.nextLine());
			System.out.print("Input product Unit   : ");
			product[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.println();
			
		}
		
		Line();
		System.out.println("List of product in 'LOW' status.");
		Line();
		for(int i=0;i<listStock;i++) {
			if(product[i].getUnit()<5) {
				System.out.println(">> "+product[i].getId()+" has "+product[i].getUnit()+" unit");
			}
		}
		
		Line();
		System.out.println("List of product in 'NORMAL' status.");
		Line();
		for(int i=0;i<listStock;i++) {
			if(product[i].getUnit()>=5&&product[i].getUnit()<=50) {
				System.out.println(">> "+product[i].getId()+" has "+product[i].getUnit()+" unit");
			}
		}
		
		Line();
		System.out.println("List of product in 'HIGHT' status.");
		Line();
		for(int i=0;i<listStock;i++) {
			if(product[i].getUnit()>50) {
				System.out.println(">> "+product[i].getId()+" has "+product[i].getUnit()+" unit");
			}
		}
		
		
		

	}
	
	public static void Line() {
		for(int i=0;i<30;i++) {
				System.out.print("-");
		}
		System.out.println();
	}

}
