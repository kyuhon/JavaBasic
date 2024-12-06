package kr.co.kh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMain {

	public static void main(String[] args) {
		//1차원 정수형배열을 만듬
		int[] array = new int[10];
		System.out.println(System.identityHashCode(array));
		//리턴값을 안받는건 void
		insertArray(array);
		
		printArray(array);
		
		Arrays.sort(array);
		
		System.out.println("===");
		printArray(array);
		//정렬을 하고 싶은데 잘 안된다. ArrayList 만들면된다
		Integer[] array2 = {1,4,7,3,10,9,5,6,2,7};
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(array2);
		Collections.reverse(list);
		System.out.println("*****");
		
		
		
		//배열에 8이라는 숫자를 채우기
		Arrays.fill(array, 8);
		printArray(array);
	}
	
	
	private static void insertArray(int[] array) {
	for(int i=0;i<array.length;i++) {
		array[i] = (int)(Math.random()*(10-1+1)+1);
		System.out.println(array[i]);
		}
	}
	
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			}
	}
}
