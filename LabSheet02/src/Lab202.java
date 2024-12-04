import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		int beforeNumber = -999999999;
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.print("input number : ");
			 int num = input.nextInt();
			 if(beforeNumber > num) {
				 break;
			 }
			 beforeNumber = num;
		}
		System.out.print("\nBYE BYE");


	}

}
