import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numArray = {78,36,58,41,25,92,75};
		int chackIndex = 0;
		System.out.print("Input indext of array : ");
		int index = scan.nextInt();
		while(true) {
			for(int i = 0;i<numArray.length;i++) {
				if(i == index) {
					chackIndex++;
				}
			}
			if(chackIndex >= 1 ) {
				break;
			}
			System.out.print("Input indext of array, : ");
			index = scan.nextInt();
		}
		int current = 0;
		int nextnum = 0;
		for(int i = 0;i<numArray.length;i++) {
			if(i == index) {
				current =  numArray[i];
			}
		}
		for(int i = 0;i<numArray.length;i++) {
			if(i == index+1) {
				nextnum =  numArray[i];
			}
		}
		String textNext = (nextnum == 0 ? "Sorry, "+index+" is the last index in array": "Value in next    index is "+nextnum);
		
		System.out.println();
		
		System.out.println("Value in current index is "+current+"\n"+textNext);
		

	}
}

