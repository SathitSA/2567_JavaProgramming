

import java.util.*;
public class Lab307 {

	public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			String text = "";
			String palindromeCk = "";
			System.out.print("Text: ");
			text = scan.nextLine().trim().replace(" ", "").toLowerCase();
			for(int i = text.length()-1;i>=0;i--) {
				char ch = text.charAt(i);
				palindromeCk+=ch;
			}
			
			
			
			if(palindromeCk.equals(text)) {
				System.out.println("It is palindrom");
			}else {
				System.out.println("It is not palindrom");
			}
		}

	}  
