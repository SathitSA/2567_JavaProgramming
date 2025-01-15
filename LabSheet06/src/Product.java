
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	
	public void setproductDetails(String name,double price,double vatRate) {
		this.name = name;
		this.price = price;
		this.vatRate = vatRate;
	}
	
	public double calcurateTotaPrice() {
		return (price+(price*(vatRate/100)));
	}
	
	public void displayProductDetail() {
		System.out.println("Product Details:");
		System.out.println("Product Name: "+name);
		System.out.println("Price(before vat): "+price);
		System.out.println("Price(after vat): "+calcurateTotaPrice());
	}
}

