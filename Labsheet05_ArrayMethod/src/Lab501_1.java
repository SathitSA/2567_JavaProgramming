import javax.swing.JOptionPane;
public class Lab501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		boolean depWasFound = false;
		
		String dept = JOptionPane.showInputDialog("Enter a department name");
		for(int i=0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				depWasFound = true;				
			}			
		}
		if(depWasFound) {
			JOptionPane.showMessageDialog(null, dept+"was found in the list");
		}else {
			JOptionPane.showMessageDialog(null, dept+"not was found in the list");
		}
		
		

	}

}
