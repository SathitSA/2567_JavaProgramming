import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[] num = {25,78,41,22,36,85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		
		while(true) {
			if(checkindex(num,index) == true) {
				break;
			}
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		int current = current(num,index);
		
		int prenum = preData(num, index);
		
		int nextnum = nextData(num, index);
		
		String textpre = (prenum == 0 ? "No previous data": "Previous data nums["+(index-1)+"] is " + prenum);
		
		String textnext = (nextnum == 0 ? "No next data": "Next data nums["+(index+1)+"] is " + nextnum);
		
		/*String textNoPre = "";
		String textNoNext = "";
		if(prenum == 0) {
			textNoPre = "No previous data";
		}
		if(nextnum == 0) {
			textNoNext = "No next data";
		}*/
		
		JOptionPane.showMessageDialog(null, "Current data, numss[" + index +"] is "+ current+"\n"+textpre+"\n"+textnext);
		
		
	}
	
	public static boolean checkindex(int[] num,int index) {
		for(int i = 0;i<num.length;i++) {
			if(i == index) {
				return true;
			}
		}
		return false;
	}
	public  static int current(int[] num,int index) {
		int current = 0;
		for(int i = 0;i<num.length;i++) {
			if(i == index) {
				current = num[i];
			}
		}
		return current;
	}
	
	public static int preData(int[] num,int index) {
		int preData = 0;
		for(int i = 0;i<num.length;i++) {
			if(i == index-1) {
				preData = num[i];
			}
		}
		return preData;
	}
	
	public static int nextData(int[] num,int index) {
		int nextData = 0;
		for(int i = 0;i<num.length;i++) {
			if(i == index+1) {
				nextData = num[i];
			}
		}
		return nextData;
	}



	}


