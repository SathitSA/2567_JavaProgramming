
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Default Constructor
	Car(){
		/*companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;*/
		
		this("Unknow","Unknow",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีที่ผลิต 2000 หากค่าที่ใส่ไม่ถูก
		this.year = year<1886? 2000:year;
		this.mileage = mileage;
	}
	
	//getter and setter method
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else
			System.out.println("Error: Invalid company name or model name!");
	}
	public String getCompanyName() {
		return companyName;
	}
	
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else
			System.out.println("Error: Invalid company name or model name!");
	}
	public String getModelName() {
		return modelName;
	}
	
	public void setYear(int year) {
		if(year > 1886) {
			this.year = year;
		}else
			System.out.println("Error: Invalid year!");
	}
	public int getYear() {
		return year;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public String toString() {
		return "Company Name: "+companyName+"\nModel Name: "+modelName+"\nYear: "+year+"\nMileage: "+mileage;
	}

}
