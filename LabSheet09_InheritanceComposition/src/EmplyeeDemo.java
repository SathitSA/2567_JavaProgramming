import java.util.*;
public class EmplyeeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input employee id :");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("input employee name :");
		String empName = scan.nextLine();
		System.out.print("input employee salary :");
		double empSalary = scan.nextDouble();
		scan.nextLine();
		System.out.print("Input employee sales :");
		double empSales = scan.nextDouble();
		scan.nextLine();
		
		Sales emp1 = new Sales(empId,empName,empSalary,empSales);
		System.out.println(emp1);
		
	}

}
