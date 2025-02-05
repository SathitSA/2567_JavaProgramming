
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	Movie(String id ,String name,Director director){
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	Movie(){
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Director getDirector() {
		return this.director;
	}
	
}
