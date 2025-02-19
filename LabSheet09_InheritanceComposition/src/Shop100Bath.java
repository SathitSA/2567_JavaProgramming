import javax.swing.JOptionPane;
public class Shop100Bath {

	public static void main(String[] args) {
		//int unit = Integer.parseInt(JOptionPane.showInputDialog("In put the number of product:"));
		
		int YesNo = JOptionPane.showConfirmDialog(null, "Is the Program run on Pattanakarn Branch");
		
		int unit = Integer.parseInt(JOptionPane.showInputDialog("In put the number of product:"));
		
		if(YesNo == 0) {
			PattanakarnBranch sold = new PattanakarnBranch();
			sold.setUnit(unit);
			JOptionPane.showMessageDialog(null,sold);
		}else {
			Product sold = new Product();
			sold.setUnit(unit);
			JOptionPane.showMessageDialog(null,sold);
		}

	}

}
