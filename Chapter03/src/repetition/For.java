package repetition;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		// 반복의 변수는 i,j(k,l,m 까지 가지는 않는다)

		System.out.println("1번 for문: 기본");
		for (int i = 20; i < 25; i++) {
			System.out.println("i값은 " + (i - 20) + " ");
		}
		// 함수에 사용하는 변수는 식 안에 넣는다

		System.out.println();

		
		
		
		
		System.out.println("2번 for문: 팩토리얼(Factorial)");
		long sum = 1;
		int x = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하시오:");
		x = scanner.nextInt();

		for (int i = 1; i < x + 1; i++) {
			sum *= i;
		}
		System.out.println("" + x + "!는 " + sum + "입니다");

		System.out.println();

		
		
		
		
		System.out.println("3번 for문: 입력한 숫자의 약수");
		int y = 0;

		System.out.print("양의 정수를 입력하시오:");
		y = scanner.nextInt();

		System.out.println("" + x + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= y; i++) {
			if (y % i == 0) {
				System.out.println("" + i);
			}
		}

		System.out.println();
		
		
		System.out.println("4번 for문: month");
		int month = 1;
        
	     for (;true;) {
	        System.out.println("올바른 월을 입력하시오 [1-12]: ");
	        month = scanner.nextInt();
	        
	     if(month >= 1 && month <= 12){
	        System.out.println("사용자가 입력한 월은 " + month);
	        break;
	            }
	     }
	     
	     
		
	}

}
