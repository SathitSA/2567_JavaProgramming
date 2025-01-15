import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] numArray = new int[7];
	String numOdd = "";
	int countOdd = 0;
	
	for(int i = 0 ; i< numArray.length;i++) {
		System.out.print("Input score of student "+(i+1)+" : ");
		numArray[i] = scan.nextInt();
		if(numArray[i]%2 !=0) {
			numOdd += numArray[i] + " ";
			countOdd++;
		}
	}
	System.out.println("\nthere are " + countOdd + " of odd number.");
	System.out.println("List of odd number : "+numOdd);

	}

}
