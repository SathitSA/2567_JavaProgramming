
public class Ractangle {
	//private two attribute
	//private float length;
	//private float width;
	
	//
	/*Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}*/
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	Ractangle() {}
	
	Ractangle(float length,float width){
		this.length = length;
		this.width = width;
	}
	
	//Getter and Setter method
	public float geLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float geWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//Method to calculate area
	public double getArea() {
		return this.length*this.width;
	}
	
	//Method to calculate perimeter
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	
	public String showData() {
		return "Ractangle[length"+ this.length+",width = "+this.width+"]";	
	}
	
	//Method to display using toString
	public String toString() {
		return "Ractangle[length"+ this.length+",width = "+this.width+"]";	
	}
}
