import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String StudenID,subjectCode;
		boolean isStudentIDValid,isStudentCodeValid;
		//input student ID
		System.out.print("Enter student ID (10 digite): ");
		StudenID = scan.nextLine();
		
		System.out.print("Enter subject code (7 digite): ");
		subjectCode = scan.nextLine();
		
		isStudentIDValid = isLenght(StudenID,10);
		isStudentCodeValid = isLenght(subjectCode,7);
		
		while(!isStudentIDValid && !isStudentCodeValid ) {
			System.out.print("Enter student ID (10 digite): ");
			StudenID = scan.nextLine();
			System.out.print("Enter subject code (7 digite): ");
			subjectCode = scan.nextLine();
			isStudentIDValid = isLenght(StudenID,10);
			isStudentCodeValid = isLenght(subjectCode,7);
		}
		
		if(isStudentIDValid && isStudentCodeValid) {
			boolean isITStudent = isITStudent(StudenID);
			boolean isITSubject = isITSubject(subjectCode);
			
			
			displayData(isITStudent,isITSubject);
		}

	}
	
	public static boolean isLenght(String input,int len) {
		return input.length() == len;
	}
	public static boolean isITStudent(String SID) {
		String yearStudy = SID.substring(3);
		String isIT = SID.substring(4,6);
		if(yearStudy == "1" && isIT == "311") {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isITSubject(String SBJ) {
		String NumSubject = SBJ.substring(1,2);
		String YearSub = SBJ.substring(5);
		if(NumSubject == "21" && YearSub == "1") {
			return true;
		}else {
			return false;
		}
	}
	
	public static void displayData(boolean ITStud,boolean ITSub) {
		
	}

}
