
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		System.out.printf("Perimeter: %.2f",rc.getPerimeter());
		System.out.println();
		System.out.printf("Area: %.2f",rc.getArea());
		
		rc.resize(50);
		System.out.println("After resize(50%) : " + rc);
		System.out.printf("Perimeter: %.2f",rc.getPerimeter());
		System.out.println();
		System.out.printf("Area: %.2f",rc.getArea());

	}
	
	public void Line() {
		for(int i =0;i<30;i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
