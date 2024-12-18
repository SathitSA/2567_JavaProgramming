import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name, separted by space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); //หาช่องว่าง
		firstName = fullName.substring(0,space);
		
		//System.out.print(firstName);
		
		//to get middleName
		System.out.println(abbreviatName(fullName)+firstName);
		
		
		input.close();
	}//end of main method
	
	public static String abbreviatName(String fName) {
		String intaiLetter= "";
		
		for(int i = 0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				intaiLetter = (intaiLetter+fName.charAt(i+1)).toUpperCase();
				intaiLetter = intaiLetter+".";
			}
		}//end for
		return intaiLetter;
	}

}
