import javax.swing.JOptionPane;
public class JavaClassLab104 {
	public static void main(String[] args) {
	int var = JOptionPane.showConfirmDialog(null, "Wellcome to the payroll application"
			,"Massage"
			,JOptionPane.CLOSED_OPTION,JOptionPane.INFORMATION_MESSAGE);
	String nameEmployeeInput = JOptionPane.showInputDialog("Enter employee name");
    String nameEmployee = nameEmployeeInput;
    String employeeHourInput = JOptionPane.showInputDialog("Enter total hours for this employee");
    double employeeHour = Integer.parseInt(employeeHourInput);
    double hourlyWage = 7.5;
    double taxRate = 0.15;
    double grossEarnings = employeeHour * hourlyWage;
    double Tex = grossEarnings * taxRate;
    double netEarting = grossEarnings - Tex;
    String formattedEHI = String.format("%,.1f", employeeHour);
    String formattedGE = String.format("%,.1f", grossEarnings);
    String formattedTEX = String.format("%,.1f", Tex);
    String formattedNE = String.format("%,.1f", netEarting);
    
    JOptionPane.showMessageDialog(null, "Employee name: " + nameEmployee + "\nHour worked: " + formattedEHI
    		+ "\nHourly wage: $ " + hourlyWage + "\nGross earing: $ " + formattedGE + "\nTax rate: " + taxRate
    		+ "\nTax: $ " + formattedTEX + "\nNet earning: $ " + formattedNE);

}
}
