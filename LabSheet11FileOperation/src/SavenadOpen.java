import java.io.*;
import java.util.*;

public class SavenadOpen extends Employee{
	
	private String name;
	private String dept;
	
	
	public void insert() throws IOException{
		//ประกาศ object input ดพื่อรับข้อมูลทาง console
		Scanner input = new Scanner(System.in);
		//ประกาศ object ชื่อ writFile
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		String answer;
		do {
			super.header();
			//รับข้อมูงชื่อกับข้อมูลทาง console
			System.out.print("Input name: ");
			name = input.next();
			
			System.out.print("Input department: ");
			dept = input.next();
			//บันทึกชื่อกับข้อมูลลงไปในไฟล์
			writeFile.println(name+"\t"+dept);
			
			
			System.out.print("Do you want to input data again? : ");
			answer = input.next();
			
		}while(answer.equals("y"));
		
	}
	public void searchData() throws IOException{
		try {
			//ใช่class scanner สำหระบเปิดอ่านไฟล์
			Scanner readFile =new Scanner(new File("src//txtFile//employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next(); //ตัวแปรdept ใน file employee
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					check =true;
				}
				if(check) {
					super.header();
					System.out.print("Employee in dept "+ super.getDept()+" is "+ i +" person(s).");
					System.out.println();
					super.header();
				}
				else {
					System.out.println("\nSorry, no dept: "+super.getDept()+"in file.");
				}
				
				
				
				
			}
			
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}

}
