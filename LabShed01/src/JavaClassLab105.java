import javax.swing.JOptionPane;
public class JavaClassLab105 {
	public static void main(String[] args) {
	String cdIDInput = JOptionPane.showInputDialog("This program calculate the total cost os a CD order"
			+ " \nplaease enter the ID of theCD");
    String cdID = cdIDInput;
    String cdNameInput = JOptionPane.showInputDialog("Pease enter the title of the CD");
    String cdName = cdNameInput;
    String cdPriceInput = JOptionPane.showInputDialog("Pease enter price of the CD in U.S dollars");
    double cdPrice = Double.parseDouble(cdPriceInput);
    String cdQuantityInput = JOptionPane.showInputDialog("Pease enter quantity to be purchased");
    int cdQuantity = Integer.parseInt(cdQuantityInput);
    double taxRate = 6.25;
    
    double subTotal =  cdPrice * cdQuantity;
    double Tax = subTotal * (taxRate/100);
    double Total = subTotal + Tax;
    
    String formattedST = String.format("%,.1f",subTotal);
    
    
    JOptionPane.showMessageDialog(null,"Summary of the transaction\n\n" + "CD ID: " + cdID + "\nCD Title: " + cdName
    		+ "\nCD Unit Price: $" + cdPrice + "\nCD Quantity: " + cdQuantity + "\n\nSubtotal: $" + formattedST 
    		+ "\nTax rate: " + taxRate  + "%"+ "\nTotal: $" + Total + "\n\nEnd of Program");


}
}
