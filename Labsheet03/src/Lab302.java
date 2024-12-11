import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		
		boolean chkEmail = false;
		
		String inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
		
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail = JOptionPane.showInputDialog("input your e-mail,again");
		}
		
		chkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com");
		
		if(chkEmail) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+ inputEmail);
		}else
			JOptionPane.showMessageDialog(null, "Yor e-mail is not hot mail or gmail dot com");
		
	}

}
