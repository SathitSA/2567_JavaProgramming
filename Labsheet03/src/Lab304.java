import java.util.*;

public class Lab304 {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String Name = "";
			int spacecount = 0;
			
			System.out.print("Full Name: ");
			 Name = scan.nextLine();
			 for(int i = 0;i<Name.length();i++) {
				 char ch = Name.charAt(i);
				 if(ch == ' ') {
					 spacecount++;
				 }
				 
			 }
			 if(spacecount == 0) {
				 System.out.println("Incorrect Name");
				 
			 }else {
			 String firstName  = Name.substring(0,Name.indexOf(" ")).toUpperCase();
			 String LasttName  = Name.substring(Name.indexOf(" ")+1).toLowerCase();
			 System.out.println("First Name: "+firstName);
			 System.out.println("Last Name: "+LasttName);
			 }
			 
			 
		}

	}
