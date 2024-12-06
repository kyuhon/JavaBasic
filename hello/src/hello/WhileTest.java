package hello;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int sum = 0;
		
		
		while (x!=-1) {
			sum += x;
			System.out.print("정수를 입력하시오:");
			x = scan.nextInt();
		}
		System.out.println("정수의 합은 "+sum+"입니다.");
		
		
	}

}
