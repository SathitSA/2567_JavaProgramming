
import javax.swing.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');
		
		int typeDrink = Integer.parseInt(JOptionPane.showInputDialog("Drink type: "));
		int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Coffee type: "));
		char sizeCoffee = JOptionPane.showInputDialog(null,"Coffe size:").charAt(0);
		int typeBarista = Integer.parseInt(JOptionPane.showInputDialog("Barista number: "));
		
		Barista WhoBarista = typeBarista == 2 ? staff2 : staff1 ;
		
		Coffee order = new Coffee(typeDrink,sizeCoffee,typeCoffee,WhoBarista);
		
		JOptionPane.showMessageDialog(null, order.toString());

	}

}
