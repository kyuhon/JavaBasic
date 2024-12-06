package kr.co.kh.calendar;

import java.util.ArrayList;
import java.util.Arrays;

public class CalendarArray {

	public static void main(String[] args) {
		
		Integer[] a = new Integer[10];
		
		for(int i = 0; i<10; i++) {
			a[i] = (int)(Math.random()*(10)+1);
		
		}
		for (Integer data : a) {
			System.out.println(data.toString());
		}
		System.out.println("=================");
		Arrays.sort(a);
		for (Integer data : a) {
			System.out.println(data.toString());
		}
	}

}
