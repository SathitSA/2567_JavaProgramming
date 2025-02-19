
public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name = name;
		this.gender= gender;
	}
	
	public Barista() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if(this.gender == 'm' || this.gender == 'M') {
			return "Male";
		}else if(this.gender == 'f' || this.gender == 'F'){
			return "Female";
		}else {
			return " ";
		}
	}
	
	

}
