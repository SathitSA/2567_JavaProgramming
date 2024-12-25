import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		
		String yearInput = JOptionPane.showInputDialog(null, "Input year:");
	    int year = Integer.parseInt(yearInput);
		while (!checkYear(year)) {
			 yearInput = JOptionPane.showInputDialog(null, "Input year again:");
		    year = Integer.parseInt(yearInput);
		}
		String Text = "";
		if(isLeapYear(year)) {
			Text = "";
		}else
			Text = "Not";
		JOptionPane.showMessageDialog(null,year + " is " + Text + " Leap year.");
		 

	}
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}else
			return false;
	}
	
	public static boolean isLeapYear(int year) {
		return year%4==0&&year%100!=0||year%400==0;
	}

}

