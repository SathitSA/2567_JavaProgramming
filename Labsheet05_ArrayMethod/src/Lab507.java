import javax.swing.JOptionPane;
public class Lab507 {

	public static void main(String[] args) {
		int totalnum = 0;
		for (int i =0;i<5;i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number "+(i+1)+":"));
			int[] numArray = {num};
		}
		
		showEven(numArray);
		
	}
	public static void showEven(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			int itemPrice=0;
			if(nums[i] %  2 == 0) {
				itemPrice = nums[i];
			}
			JOptionPane.showMessageDialog(null, "List of even number:\n"+itemPrice);
	}
	}
	
	public static void showOdd(int[] nums) {
		for(int _num : nums) {
			if(_num % 2 != 0) {
				
			}
		}
	}

}
