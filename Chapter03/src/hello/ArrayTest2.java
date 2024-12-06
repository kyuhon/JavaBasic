package hello;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int [][] array = new int [4][5];
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j] = (int)(Math.random()*(2));
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]==1) {
					count ++;
				}
			}
		}
		System.out.println("1의 개수는 "+count+"");
		
	}

}
