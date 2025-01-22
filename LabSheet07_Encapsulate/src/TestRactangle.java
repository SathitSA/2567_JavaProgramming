
public class TestRactangle {

	public static void main(String[] args) {
		//Test constructor
		Ractangle r1 = new Ractangle(); 
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Display data using toString() method");
		System.out.println(r1); //System.out.println(r1.tostring());
		Spacing();
		Ractangle r2 = new Ractangle(1.2f,3.4f);
		System.out.println(r2);
		
		//Test setter and getter method()
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("length is "+r1.geLength());
		System.out.println("width is "+r1.geWidth());
		
		//Test getArea() and get Perimeter()
		Spacing();
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("perimater is %.2f%n", r1.getPerimeter());
		
	    Spacing();
		System.out.printf("area is %.2f%n", r2.getArea());
		System.out.printf("perimater is %.2f%n", r2.getPerimeter());
		
		
	}
	public static void Spacing() {
		System.out.println();
	}

}
