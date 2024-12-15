package term;

import java.util.Scanner;

public class Printf {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		System.out.printf("정수를 입력하시요:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i <= n; i++)
		fact = fact * i;
		System.out.printf("%d!은 %d입니다.\n", n, fact);
		
//		printf: 포맷화된 출력을 수행하는 함수 또는 메서드
//		%d: 정수를 출력할 때 사용하는 형식 지정자
//		%f: 실수 출력
//		%s: 문자열 출력
//		%c: 문자 출력
//		\n: 줄바꿈

	}

}
