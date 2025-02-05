public class Data {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	public Data(){
		dMonth = 0;
		dDay = 0;
		dYear= 0;
	}
	
	public Data(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear= year;
	}
	
	public void setData(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear= year;
	}
	
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return (getMonth()+"-"+getDay()+"-"+getYear());
	}
	
}
