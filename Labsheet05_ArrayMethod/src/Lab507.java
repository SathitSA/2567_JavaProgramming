import javax.swing.JOptionPane;
public class Lab507 {
	public static void main(String[] args) {
		int[] numArray = new int[5];
		for (int i = 0 ; i<5;i++) {
			numArray[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number "+ (i+1) +":"));
			
		}
		/*for(in i = 0 ; i<5;i++) {
			System.out.println(numArray[i]);
		}*/
		showEven(numArray);
		
		showOdd(numArray);

	}
	public static void showEven(int num[]) {
		String numOut = "";
		for(int i = 0 ; i<5;i++) {
			if(num[i] % 2 == 0) {
				numOut +=  num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+numOut);
	}
	
	public static void showOdd(int num[]) {
		String numOut = "";
		for(int i = 0 ; i<5;i++) {
			if(num[i] % 2 != 0) {
				numOut +=  num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of Odd number:\n"+numOut);
	}

}
