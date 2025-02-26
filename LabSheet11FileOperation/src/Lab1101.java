import java.util.*;
import java.io.*;
public class Lab1101 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		System.out.print("inpt Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudenList(section);
		
		
	}//End of main
	
	public static void printHeader(int sec) {
		System.out.println("*******************************************************************************");
		System.out.println("\t\tList of DAta for Secton "+sec);
		System.out.println("*******************************************************************************");

	}//end of printHeader
	
	public static void displayStudenList(int sec) throws IOException{
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp = "";
			while((temp = readFile.readLine() )!=null) {
				String[] data = temp.split("\t");
				
				if(data.length < 6)continue; //Ensure
				
				int studentSection = Integer.parseInt(data[3]);//แปลกลุ่มเรียนในไฟล์ให้เป็นint
				
				if(studentSection == sec) {
					
					double midTerm = Double.parseDouble(data[4]);
					
					double finalScore = Double.parseDouble(data[5]);
					
					System.out.printf("%s %s \t %.2f \t %.2f \t %s %n ",data[0],data[2],midTerm,finalScore,determaineResult(midTerm,finalScore));
				}
				
			}//end of while
			
		}//end of try
		
	}//end of displayStudenList
	
	public static String determaineResult(double mid,double fin) {
		return (mid+fin) <= 40? "Fail" : "Pass";
	}//end of determaineResult
	
	
	
	
	

}
