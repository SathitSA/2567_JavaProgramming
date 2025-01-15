import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] numArray = new double[5];
		double total =0;
		
		for(int i = 0 ; i< numArray.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			numArray[i] = scan.nextDouble();
			total += numArray[i];
		}
		double avgScore = total/numArray.length;
		String outLineScor = "";
		for (int i = 0 ; i< numArray.length;i++) {
			if(numArray[i] > avgScore) {
				outLineScor += String.format("> Student "+(i + 1)+" ($%.2f)\n", numArray[i]);
			}
		}
		System.out.println();
		System.out.printf("Average of 5 student is $%.2f",avgScore);
		System.out.println();
		System.out.printf(outLineScor);
		

	}

}
