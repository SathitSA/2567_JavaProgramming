import javax.swing.JOptionPane;

public class Lab302_1 {

	public static void main(String[] args) {
		String inputEmail ;
		boolean chkEmail = false;
		
		
		
		while(true) {
			inputEmail = JOptionPane.showInputDialog("input your e-mail,again");
			while(inputEmail.startsWith("@")||inputEmail.contains(" "));{
				inputEmail = JOptionPane.showInputDialog("input your e-mail,again");
			}
			
			chkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com");
			if(chkEmail) {
				JOptionPane.showMessageDialog(null,"Your e-mail is "+ inputEmail);
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Yor e-mail is not hot mail or gmail dot com");
				continue;
			}
			
			
			
		}

	}
}


