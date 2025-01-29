import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("How many student in classroom: ");
		int numberofStudent = scan.nextInt();
		//Consume newLie character
		scan.nextLine();
		
		//1.Create an array of student object
		Student[] students = new Student[numberofStudent];
		
		//input information for each student
		for(int i=0;i<numberofStudent;i++) {
			//2.create a new Student object
			students[i] = new Student();
			
			System.out.println("\nIMPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			//Input student's Name
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
			//students[i].setName(stdName);
			
			students[i].setName(scan.nextLine());
			//Input student's score and validate
			System.out.print("Input studen score: ");
			int score = scan.nextInt();
			scan.nextLine();
			while(true) {
				System.out.print("Input score, again: ");
				score = scan.nextInt();
				
				//Consume newLie character
				scan.nextLine();
				students[i].setScore(score);
				
				if(students[i].checkScore()) {
					//System.out.print("Input score, again: ");
					break;
				}
			}//end of while
						
			
			
		}//end of for
		//Display the list of student who passed
		System.out.println("\nLIST OF PAS STUDENT(>=50):");
		Line();
		for(Student student : students) {
			if(student.isPass()) {
				System.out.println(">> "+student.getName()+" ("+student.getScore()+") "+fineGrade(student.getScore()));
			}
		}

		
		scan.close();
	}//end of main() method
	
	public static void Line() {
		for(int i = 1;i<60;i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
	
	public static String fineGrade(int score) {
		if(score >= 80) {
			return "get grade A";
		}else if(score >= 75 && score <=79) {
			return "get grade B+";
		}else if(score >= 70 && score <=74) {
			return "get grade B";
		}else if(score >= 65 && score <=69) {
			return "get grade C+";
		}else if(score >= 60 && score <=64) {
			return "get grade C";
		}else if(score >= 55 && score <=59) {
			return "get grade D+";
		}else if(score >= 50 && score <=54) {
			return "get grade D";
		}else {
			return "get grade F";
		}
	}

}
