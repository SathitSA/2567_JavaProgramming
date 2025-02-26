import java.io.IOException;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		String choose;
		
		System.out.print("Insert or Serch data: ");
		choose = input.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Insert or Serch data ,again?: ");
			choose = input.next().toLowerCase();
		}//end while
		
		SavenadOpen objFile = new SavenadOpen();
		if(choose.equals("insert")) {
			objFile.insert();
		}else if(choose.equals("search")) {
			System.out.print("\nEnter detartment: ");
			String dept = input.next();
			objFile.setdept(dept);
			objFile.searchData();
		}

	}

}
