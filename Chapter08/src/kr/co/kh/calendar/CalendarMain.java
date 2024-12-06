package kr.co.kh.calendar;

import java.util.Calendar;

public class CalendarMain {
	public static final String[] DAY_WEEK = {"","일","월","화","수","목","금","토"};

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		printCalendar(c);
		
		// 시간을 셋팅하는 방법
		System.out.println("=============");
		c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, 11); //12월을 입력하고 싶으면 -1 빼라
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 16);
		c.set(Calendar.MINUTE, 50);
		c.set(Calendar.SECOND, 50);
		c.set(Calendar.MILLISECOND, 500);
		
		printCalendar(c);
		
		
		
	}

	private static void printCalendar(Calendar c) {
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+1 +"월");
		System.out.println(c.get(Calendar.DATE) +"일");
		System.out.println(DAY_WEEK[c.get(Calendar.DAY_OF_WEEK)] +"요일");
	
		System.out.println(c.get(Calendar.HOUR_OF_DAY) +"시간");
		System.out.println(c.get(Calendar.MINUTE) +"분");
		System.out.println(c.get(Calendar.SECOND) +"초");
		System.out.println(c.get(Calendar.MILLISECOND)/1000.0 +"1/1000초");		
	}

}
