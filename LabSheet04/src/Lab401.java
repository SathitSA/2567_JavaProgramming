import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		inputEmail();
	}//End of main
	
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("input ypur e-mail.");
			if(varEmail != null && !varEmail.isEmpty()){
				ChackEmailError(varEmail);
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot empty!!");
			}
						
			
			ans = JOptionPane.showInputDialog("Do ypu want to in put email address[y/Y].");
		}while(ans != null && ans.equalsIgnoreCase("y") );
	}//end of input Email method
	
	
	//chackEmailError method
	public static void ChackEmailError (String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again.");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				chackEmail(email)
				?"Your e-mail is "+email
				:"Your e-mail is not a hotmail 0r gmail addres."//return false
				);
				
	}//end of chackEmailError method
	
	public static boolean chackEmail(String email) {
		/*if(email.endsWith("@gamil.com") || email.endsWith("@gamil.com")) {
			return true;
		}else {
			return false;
		}*/
		
		/*if(email.endsWith("@gamil.com") || email.endsWith("@gamil.com")) {
			return true;
		}
		return false;*/
		
		return (email.startsWith("@")||email.contains(" "));
	
		
	}

}
