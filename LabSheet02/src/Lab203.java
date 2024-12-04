import java.util.*;
import javax.swing.JOptionPane;
public class Lab203 {
	
	public static void main(String[] args) {
		double Weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Input height"));
		double BMI = Weight/((Height/100)*(Height/100));
		String text = "";
		if(BMI < 18.5) {
			text = "Underweight";
		}else if (BMI >= 24.9 && BMI <= 24.9) {
			text = "Normal-weight";
		}else if (BMI >= 25.0 && BMI <= 29.9) {
			text = "Overweight";
		}else if (BMI >= 30.0) {
			text = "Obesity";
		}
		JOptionPane.showInternalMessageDialog(null, "BMI = " + BMI + "\nYou're" + text);
	}

}
