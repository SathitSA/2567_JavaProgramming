import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declare constants
		final double BASE_SALAY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		
		while(true) {
			System.out.print("Emter gross sales for the saleperson(or -1 to end): ");
			sales = input.nextInt();
			
			//check foe sentinel value
			if(sales==SENTINEL) {
				break;
			}
			
			salary =BASE_SALAY + (sales * COMMISSION_RATE);
			
			System.out.printf("The saleperson,s salaryis : %,.2f%n%n",salary);
			
			System.out.println("bye");
			
		}
		//Compute salary
		
		
		input.close();
	}

}
