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
		
		while(StudenID.length() != 10 && subjectCode.length() != 7 ) {
			System.out.print("Enter student ID (10 digite): ");
			StudenID = scan.nextLine();
			System.out.print("Enter subject code (7 digite): ");
			subjectCode = scan.nextLine();
			isStudentIDValid = isLenght(StudenID,10);
			isStudentCodeValid = isLenght(subjectCode,7);
		}
		
		if(isStudentIDValid && isStudentCodeValid) {
			//boolean isITStudent = isITStudent(StudenID);
			//boolean isITSubject = isITSubject(subjectCode);
			
			
			//displayData(isITStudent,isITSubject);
		}

	}
	
	public static boolean isLenght(String input,int len) {
		return input.length() == len;
	}

}
