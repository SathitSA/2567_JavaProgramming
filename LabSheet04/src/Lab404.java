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
		
		while(!isStudentIDValid || !isStudentCodeValid ) {
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
			
			
			displayData(isITStudent,isITSubject,StudenID);
		}

	}
	
	public static boolean isLenght(String input,int len) {
		return input.length() == len;
	}
	public static boolean isITStudent(String SID) {
		String yearStudy = SID.substring(1,2);
		String isIT = SID.substring(3,6);
		if(yearStudy.equals("1") && isIT.equals("311")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isITSubject(String SBJ) {
		String NumSubject = SBJ.substring(0,2);
		String YearSub = SBJ.substring(4,5);
		if(NumSubject.equals("21")&& YearSub.equals("1")){
			return true;
		}else {
			return false;
		}
	}
	
	public static void displayData(boolean ITStud,boolean ITSub,String stuID) {
		
		String textID = ITStud ? " is" : " is not";
        String textSub = ITSub ? "" : "not ";
        String textAnd = (ITStud == ITSub) ? "and " : "";
        
        
		System.out.print("Student id: " + stuID + textID + " 1st year student in IT " +
		textAnd +"\n"+textSub + "Enroll in courses for Year 1");
		
	}

}

