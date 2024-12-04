import javax.swing.JOptionPane;
public class JavaClassLab103 {
	public static void main(String[] args) {
		 String timeParkMinuteInput = JOptionPane.showInputDialog("Input the number     of minute: ");
		    int timeParkMinute = Integer.parseInt(timeParkMinuteInput);
		    double timeParkHour = timeParkMinute / 60;
		    double timeMinute = timeParkMinute % 60;
		    String formattedH = String.format("%,.00f", timeParkHour);
		    String formattedM = String.format("%,.00f", timeMinute);
		    double totalPricePark = (timeParkHour*50) + (timeMinute*0.25) ;
		    String formattedTM = String.format("%,.1f", totalPricePark);
		    JOptionPane.showMessageDialog(null, "You parking " + formattedH + "hour " + formattedM 
		    		+ " minute" + "\nAmount tobe paid is" + formattedTM + "Baht." ); 
	}

}
