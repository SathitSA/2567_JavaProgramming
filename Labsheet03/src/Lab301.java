import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//กำหนดตัวแปรชื่อtext ไว้รวมข้อความเข้าด้วยกัน
		String txtConcat = "";
		
		String word;
		
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			//ตรวจสอบเงื่อไขเพื่อให้หยุดการรับข้อความ
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Program Terminate");
				break;
			}
			//การรวมข้อความที่ป้อนเข้าด้วยกัน
			txtConcat += word+" ";
			
		}
		System.out.println(txtConcat.toUpperCase());
		
		
		kb.close();
	}

}
