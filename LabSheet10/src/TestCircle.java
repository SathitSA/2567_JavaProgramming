
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		System.out.println(c1);
		System.out.printf("Perimeter: %.2f",c1.getPerimeter());
		System.out.println();
		System.out.printf("Area: %.2f",c1.getArea());
	}

}
