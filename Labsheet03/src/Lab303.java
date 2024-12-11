import java.nio.ByteOrder;
import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentance = "";
		int wordcount = 0;
		int spacebarcount = 0;
		while(true) {

			System.out.print("Input a sentance :");
			sentance = scan.nextLine();
			if(sentance.endsWith(".")) {
				break;
			}else {
				System.out.print("Input a sentance, again :");
				sentance = scan.nextLine();
			}
			for(int i=0;i<sentance.length();i++) {
				char ch = sentance.charAt(i);
				
				if(ch == ' ' || ch == '.') {
					wordcount++;
				}
				if(ch == ' ') {
					spacebarcount++;
				}
			}
			System.out.println("\nThis sentence has " + spacebarcount + "spacebar.");
			System.out.println("This sentence has " + wordcount + "word.\n");
			
		}
		
		

	}

}
