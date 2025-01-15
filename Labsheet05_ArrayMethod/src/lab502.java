import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numArray = new int[5];
		for(int i = 0;i<numArray.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			numArray[i] = scan.nextInt();		
		}
		int sum = sumOfPos(numArray);
		
		System.out.print("\nSummation of positive number is "+sum);
		
	}
	
	public static int sumOfPos(int[] num) {
		int sumAll = 0; 
		for(int i=0;i<num.length;i++) {
			sumAll += num[i];
		}
		return sumAll;
	}

}
