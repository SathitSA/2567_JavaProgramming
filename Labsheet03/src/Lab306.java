
import  java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String text = "";
		System.out.print("Text: ");
		text = scan.nextLine();
		if(text.toLowerCase().indexOf("nichi")>=0) {
			System.out.print("Nichi is a senstence");
		}else {
			System.out.print(text);
		}
	}

}

