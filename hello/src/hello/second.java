package hello;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 입력하시오:");
		int value = scanner.nextInt();
		int minute = value/60;
		int second = value%60;
		

		System.out.println(value + "초는" + minute + "분" + second + "초입니다.");
	}

}
