public class PattanakarnBranch extends Product{
	
	public int payUnit() {
		return super.getUnit()/2;
	}
	
	public int freeUnit() {
		return super.getUnit()/2;
	}
	
	public int gettotalprice() {
		return super.getTotalprice()/2;
	}
	
	public String toString() {
		return ("You buy "+payUnit() + " unit, get free "+freeUnit() +" unit ("+ gettotalprice() +").");
	}

}
