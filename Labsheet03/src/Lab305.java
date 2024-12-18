import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		String sentence = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		sentence = scan.nextLine();
		String finalSentence = "";
		while(true) {
			if(sentence.endsWith(".")) {
				break;
			}else {
				System.out.print("The sentence must end with full stop point : ");
				sentence = scan.nextLine();
			}
			
		}
		System.out.println();
		for(int i = 0;i<sentence.length();i++) {
			char ch = sentence.charAt(i);
			
			finalSentence+=ch;
			
			System.out.print(ch);
			if(ch == ' ') {
				System.out.println();
			}
			
		}

	}

}

