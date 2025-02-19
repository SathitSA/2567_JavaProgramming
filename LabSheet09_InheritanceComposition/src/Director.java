public class Director {
	private String name;
	private String email;
	private char gender;
	
	
	Director(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	Director(String name,String email){
		this(name,email,' ');
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		if(this.gender == 'f' || this.gender == 'F') {
			return "Female";
		}else if(this.gender == 'm' || this.gender == 'M') {
			return "Male";
		}else {
			return "";
		}
	}
	
	public String toString() {
		return (getName()+"("+getEmail()+";"+getGenderName()+")");
	}
}  
