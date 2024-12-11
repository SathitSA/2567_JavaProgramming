import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberX;
		int numberY;
		
			System.out.print("Input value of X : ");
			numberX = scanner.nextInt();
			System.out.print("Input value of Y : ");
			numberY = scanner.nextInt();
		while(numberY <= numberX) {
			System.out.print("Input value of Y ,again: ");
			numberY = scanner.nextInt();
			}
		 int X = numberX;
		 int sum = numberX + numberY; // เริ่มต้นผลรวม
	     int increment = numberX+1; // ค่าเพิ่มเริ่มต้นจาก Y

	     System.out.println();
	     while (increment <= numberY) { // เพิ่มค่าไปจนถึงค่า Y + 8 ตามตัวอย่าง
	         System.out.println(X + " + " + increment + " = " + (X + increment));
	         sum = X;
	         sum += increment;
	         X = sum;
	         increment++; // เพิ่มค่า increment ทีละ 1
		}
	}

}
