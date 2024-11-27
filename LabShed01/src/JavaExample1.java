import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนดobject
		Scanner input = new Scanner(System.in);
		//กำหนดobjectในการจัดรูปแบบเลข
		DecimalFormat frm = new DecimalFormat();
		//รับและหมายเหตุ ชื่อสิรค้า
		System.out.print("input product name: ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลสินค้า
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		//คำนวนหาผลรวมของสินค้า
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct) +" baht");
		//คำนวณภาษีเพิ่ม 7%
				//float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
				float totalwithVat = totalPriceofProduct * 1.07f;
				System.out.println("Add VAT 7% is "+ frm.format(totalwithVat) + " baht.");
				System.out.println(); //การเว้น 1 บรรทัด
				//Output using String.format and printf
				String frmtotalwithVat = String.format("%,.2f",totalwithVat);
				System.out.println("Output using String.format");
				System.out.println("Add VAT 7% is "+ frmtotalwithVat + " baht.");	
				System.out.println(); //การเว้น 1 บรรทัด
				System.out.println("Output using printf");
				System.out.printf("Add VAT 7%%  is %,.2f ",  totalwithVat);		
				input.close();
		
		
		input.close();
	}
 
}
