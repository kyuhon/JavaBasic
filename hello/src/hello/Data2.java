package hello;

import java.util.Scanner;

public class Data2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	
		System.out.print("정수를 입력하시오 :");
		int data = scanner.nextInt();
				
			if(data>0) {
					System.out.println("양수입니다");
			} else if (data==0) {
					System.out.println("0입니다");
			} else {
					System.out.println("음수입니다");
			}
		
		
	}

}
