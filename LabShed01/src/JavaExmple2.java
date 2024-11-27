import javax.swing.*;
public class JavaExmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input product Name");
		String strProductUnit = JOptionPane.showInputDialog("Input product Unit");
		int ProductUnit = Integer.parseInt(strProductUnit);
		double productPrict = Double.parseDouble(JOptionPane.showInputDialog("Input Prict per Unit"));
		
		Double totalPriceofProduct = ProductUnit * productPrict;
		double totalwithVat = totalPriceofProduct * 1.07;
		String frmtotalPriceofProduct = String.format("%,.2f",totalwithVat);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		JOptionPane.showMessageDialog(null,"Total price is" +totalPriceofProduct+" baht."+"\nAdd VAT7% is"+totalwithVat+ " baht.");
		 
	} 

}
