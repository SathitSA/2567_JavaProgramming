import java.util.*;
public class MovieDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String id = scan.nextLine();
		
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		
		space();
		
		System.out.print("Input director name   : ");
		String director = scan.nextLine();
		
		System.out.print("Input director e-mail : ");
		String email = scan.nextLine();
		
		System.out.print("Input director gender : ");
		String gender = scan.nextLine();
		
		while (true) {
		    if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")) {
		        break;
		    }
			System.out.print("Input director gender,again : ");
			gender  = scan.nextLine();
		}
		
		space();
		
		System.out.print("Input movie theater no. : ");
		int theater = scan.nextInt();
		scan.nextLine();
		while(true) {
			if(theater >1 && theater <15) {
				break;
			}
			System.out.print("Please input 1 - 15 only : ");
			theater = scan.nextInt();
			scan.nextLine();
		}
		
		space();
		
		Director directorMovie = new Director(director,email,gender.charAt(0));
		
		Theater Num1 = new Theater(id,name,directorMovie,theater);
		
		System.out.print(Num1);
		

	}
	
	public static void space() {
		System.out.println();
	}

}

