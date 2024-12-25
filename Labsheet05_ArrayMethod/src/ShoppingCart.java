import javax.swing.JOptionPane;
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCartAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayCartAndTotal("Milk",20.0,"Bread",15.0);
		displayCartAndTotal();
		
	}
	
	public static void displayCartAndTotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No item in the cart.");
			return;
		}
		
		System.out.println("item in the cart:");
		for(int i = 0 ;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			
			JOptionPane.showMessageDialog(null,
					"- "+ itemName,
					": $"+ itemPrice, i);
			
			//System.out.printf("- %s: $%.2f%n",itemName,itemPrice );
			
		System.out.println();
		}
	}

}

