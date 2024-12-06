package hello;

import java.util.Scanner;

public class chapter02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 변수, 상수 (주석:)
		double x=0.0, y=0.0, sum=0.0;  // 초기값 설정을 했습니다
		
		
		// 2. 계산처리
		
		  System.out.print("첫 번째 숫자를 입력하시오 :"); 
		  x = scanner.nextDouble();
		  System.out.print("두 번째 숫자를 입력하시오 :" ); 
		  y = scanner.nextDouble();
		  sum = x+y;
		
		  // 3. 출력
		System.out.println("sum="+sum);
		
		// 4. 종료
		
	}

}
