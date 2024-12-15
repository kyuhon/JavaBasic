package condition_repetition_array;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		long sum = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오:");
		x = scanner.nextInt();
		
		for (int i=1;i<x+1;i++) {
				sum*=i;
						
	}
		
		System.out.println(""+x+"!는 "+sum+"입니다");		
	}
}