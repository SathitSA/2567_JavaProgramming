import java.util.Scanner;
public class JavaClassLab102 {
	
	

	public static void main(String[] args) {
		
		  {
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Input the number of minute: ");
		    int timeMinute = sc.nextInt();
		    int timeYear = timeMinute / 525600;
		    int timeDay = (timeMinute % 525600 / 1440);
		    System.out.print(timeMinute + " minutes is approximately " + timeYear + " years and " + timeDay + " days.");
		  }

		}
		// TODO Auto-generated method stub

	}


