import java.util.*;
import java.text.DecimalFormat;
public class PensionContributionCalcutor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat Df = new  DecimalFormat("0.00");
		
		final int SALARY_CEILING = 6000;
		 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		 final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		 final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		 final double EMPLOYER_RATE_55_TO_60 = 0.13;
		 final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		 final double EMPLOYER_RATE_60_TO_65 = 0.09;
		 final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		 final double EMPLOYER_RATE_65_ABOVE = 0.075;
		 
		 int salary, age; // to be input
		 int contributableSalary;
		 double employeeContribution, employerContribution, totalContribution,employeeRate,employerRate;
		 
		 System.out.print("Entar the monthly salaly: ");
		 salary = scanner.nextInt();
		 
		 System.out.print("Entar the age: ");
		 age = scanner.nextInt();
		 
		 contributableSalary = (salary > 6000) ?  salary-(salary-6000) : salary;
		 
		 if(age <= 55) {
			 employeeRate = EMPLOYEE_RATE_55_AND_BELOW;
			 employerRate = EMPLOYER_RATE_55_AND_BELOW;
		 } else if (age <= 60) { // (60, 65]
			 employeeRate = EMPLOYEE_RATE_55_TO_60;
			 employerRate = EMPLOYER_RATE_55_TO_60;
		 } else if (age <= 65) { // (55, 60]
			 employeeRate = EMPLOYEE_RATE_60_TO_65;
			 employerRate = EMPLOYER_RATE_60_TO_65;
		 } else { // above 65
			 employeeRate = EMPLOYEE_RATE_65_ABOVE;
			 employerRate = EMPLOYER_RATE_65_ABOVE;
		 }
		 
		 employeeContribution = contributableSalary*employeeRate;
		 employerContribution = contributableSalary*employerRate;
		 
		 totalContribution = employeeContribution+employerContribution;
		 
		 System.out.println("The employee's contribution: $"+Df.format(employeeContribution));
		 System.out.println("The employer's contribution: $"+Df.format(employerContribution));
		 System.out.println("The total contribution: $"+Df.format(totalContribution));

	}

}
