
public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		
//		System.out.println(car);
//		System.out.println();
//		System.out.println("Updated Car Details:");
//		
//		car.setCompanyName("Toyota");
//		System.out.println("Company Name: "+car.getCompanyName());
//		
//		car.setModelName("UUU");
//		System.out.println("Model Name: "+car.getModelName());
//		
//		car.setYear(2015);
//		System.out.println("Year Name: "+car.getYear());
//		
//		car.setYear(1000);
//		System.out.println(car.getYear());
		
//		car.setCompanyName("");
//		System.out.print(car.getCompanyName());
//		System.out.print(" or ");
//		car.setModelName("");
//		System.out.print(car.getModelName());
		
		
		System.out.println(car);
		System.out.println();
		
		System.out.println("Updated Car Details:");
		car.setCompanyName("Toyota");
		car.setModelName("UUU");
		car.setYear(2015);
		
		System.out.println("Company Name: "+car.getCompanyName());
		System.out.println("Model Name: "+car.getModelName());
		System.out.println("Year Name: "+car.getYear());
		car.setYear(1000);
		car.setCompanyName("");
	
	}

}
