package condition_repetition_array;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int [][] seats = {
				{0,0,1,1,0},
				{0,1,0,1,0},
				{1,1,0,1,0},
				{1,1,0,0,0}
		};
		int count = 0;
		
		for (int i =0; i < seats.length ; i++) {
			for(int k =0; k<seats[i].length;k++) {
				count += seats[i][k];
			}
		}
			System.out.println("현재 관객 수는 "+count+"명입니다");
	}

}
