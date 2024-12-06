package kr.co.kh.array;

import java.util.Arrays;
import java.util.Collections;

public class StringArrayMain {

	public static void main(String[] args) {
		String[] strArray = {"aaa","ccc","fff","eee","kkk"};

		printArray(strArray);
		Arrays.sort(strArray);
		System.out.println("=====");
		printArray(strArray);
		Arrays.sort(strArray, Collections.reverseOrder());
		System.out.println("=====");
		printArray(strArray);
	
	}
	
	private static void printArray(String[] strArray) {
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	}
}
