
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista) {
		super(type,sizeCoffee);
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = Character.toUpperCase(sizeCoffee);
		this.barista = barista;
		
	}
	
	public String getTypeName() {
		switch(this.typeCoffee) {
		case 1 : return "Americano";
		case 2 : return "Espresso";
		case 3 : return "Cappuccino";
		default : return null;
		}
	}
	
	public int getTypePrice() {
		switch(this.typeCoffee) {
		case 1 : return 50;
		case 2 : return 55;
		case 3 : return 65;
		default : return 0;
		}
	}
	
	public String getSizeName() {
		switch(this.sizeCoffee) {
		case 'S' : return "Shot";
		case 'T' : return "Tall";
		case 'G' : return "Grande";
		case 'V' : return "Venti";
		default : return null;
		}
	}
	
	public int getSizePrice() {
		switch(this.sizeCoffee) {
		case 'S' : return 100;
		case 'T' : return 150;
		case 'G' : return 200;
		case 'V' : return 250;
		default : return 0;
		}
	}
	
	public int getTotalPrice() {
	    return getTypePrice() + getSizePrice() +super.getTypePrice();
	}

	
	public String toString() {
		return (super.getTypeName()+" "+getTypeName()+" ("+getSizeName()+") is "+getTotalPrice()+
				" bath.\nBarista: "+barista.getName()+" ("+barista.getGenderName()+")");
	}
	

}
