import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//input data for first employee
		System.out.println("Entar details for Employee 1: ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate = scan.nextDouble();
		
		emp1.setEmployeeDetail(empName1, empHourWorked1, empHourlyRate);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		scan.nextLine();//Consume leftover newline
		
		//input data for second employee
		System.out.println("Entar details for Employee 2: ");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetail(empName2, empHourWorked2, empHourlyRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		scan.close();
	}
	//Line Method
	public static void Line(char symbol) {
		for(int i = 1;i<50;i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}

}

