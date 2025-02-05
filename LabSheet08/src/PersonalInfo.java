public class PersonalInfo {
	private Person name;
	private Data bDay;
	private int personID;
	
	PersonalInfo() {
        name = null;
        bDay = null;
        personID = 0;
    }
	
	public PersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name = new Person(first,last);
		bDay = new Data(month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setPerson(first,last);
		bDay.setData(month,day,year);
		personID = ID;
	}
	
	public String toString() {
		return ("Name: "+name+"\nData of birth: "+bDay+"\nPersonal ID: "+personID);
	}
}
