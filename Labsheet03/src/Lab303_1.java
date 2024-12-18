import javax.swing.JOptionPane;
public class Lab303_1 {
	

		public static void main(String[] args) {
			String sentance = "";
			int wordcount = 0;
			int spacebarcouunt = 0;
			sentance = JOptionPane.showInputDialog(null,"Input a sentence:");
			while(true) {
				if(sentance.endsWith(".")) {
					break;
				}
				sentance = JOptionPane.showInputDialog(null,"Input a sentence, again:");
			}
			for(int i=0;i<sentance.length();i++) {
				char ch = sentance.charAt(i);
				if(ch == ' '||ch=='.') {
					wordcount++;
				}
				if(ch == ' ') {
					spacebarcouunt++;
				}
				
			}
			JOptionPane.showMessageDialog(null, "This sentance has "+ spacebarcouunt + " spacebar.\n" + "This sentence " + wordcount + " word.");

		}

	}
