import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberofCustomer;
		//System.out.printf("Total price is %,.2f baht.",totalPrice);
		int isMember;
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total pric is" + frm.format(totalPrice) +"baht." + "\nDo ypu have a member card?");
			
		}while(isMember == 2);
		if(isMember == 0) {//if(isMember == JOptionPane.YES_OPTION)
			double priceAfterdiscount = totalPrice*0.90;
			JOptionPane.showInternalMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterdiscount) + "baht.");
			
		}else if (isMember == 1) {
			JOptionPane.showInternalMessageDialog(null, "Amount to be paid is " + totalPrice + "baht.");
		}

	}

}
