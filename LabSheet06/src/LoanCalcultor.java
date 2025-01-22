import java.text.DecimalFormat;
public class LoanCalcultor {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void setLaonDetail (String inputProductName,double inputPrice,double inputInterestRate,int inputYears) {
		productName = inputProductName;
		price = inputPrice;
		interestRate = inputInterestRate;
		years = inputYears;
	}
	
	public double calcurateMounthlyPayment() {
		double calinterestRate = (interestRate/12)/100;
		int calMonth = years*12;
		double paymentPerMonth = (price*calinterestRate*(Math.pow(1+calinterestRate,calMonth)))/(Math.pow(1+calinterestRate,calMonth)-1);
		return  paymentPerMonth;
	}
	
	public void displayLoanCalcultor() {
		System.out.println("Product: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Interest Rate: "+interestRate+"%");
		System.out.println("Loan Period: "+years+" years");
		System.out.println("Monthly Payment: "+df.format(calcurateMounthlyPayment()));
	}
}
