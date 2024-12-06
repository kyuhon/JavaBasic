package fight;

public class Date {
	int year = 0;
	int month = 0;
	int day = 0;
	
	String print1(int year,int month,int day) {
		return year + "." + month + "." + day;
	}
	String print2(String month, int day, int year) {
		return month + " " + day + "," + year;
	}
	
}
