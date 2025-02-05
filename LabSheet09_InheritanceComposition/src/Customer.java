
public class Customer {
	private int id;
	private String Name;
	private int discount;
	
	Customer (int id,String name,int discount){
		this.id = id;
		this.Name =name;
		this.discount = discount;
	}
	
	//getter and setter
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return (getName() + "(" + getId() + ")(" + getDiscount() +"%)");
	}
}
