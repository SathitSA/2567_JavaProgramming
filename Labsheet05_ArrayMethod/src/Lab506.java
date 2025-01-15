import javax.swing.*;
public class Lab506 {

	public static void main(String[] args) {
		String[] wordArray = {"Good moring","Good afternoon","Good Evening","Good Night"};
		String textWord = "";
		for(String _wordArray : wordArray) {
			textWord += "-"+_wordArray + "\n";
		}
		JOptionPane.showMessageDialog(null, "The greeting words in English:\n"+textWord);
	}


	}


