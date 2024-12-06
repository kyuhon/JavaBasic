package hello;

import java.util.Scanner;

public class pizza {

	public static void main(String[] args) {
		
		
		// 1.변수,상수
		final double PI = 3.141592; //상수
		int smallSize = 0, largeSize = 0;   // 카멜표기법 두번째 단어 대문자사용
		double smallArea = 0.0, largeArea = 0.0;
		// 2. 계산처리
		Scanner scan = new Scanner(System.in);
		System.out.print("input smallSize :");
		smallSize = scan.nextInt();
		System.out.print("input largeSize :");
		largeSize = scan.nextInt();
		// 면적처리
		smallArea = PI * smallSize * smallSize;
		largeArea = PI * largeSize * largeSize;
		// 비교처리
		String resultValue = (2*smallArea > largeArea)?("작은사이즈선택"):("큰사이즈선택");
		
		// 3. 출력
		System.out.println("고객님 "+resultValue+" 하신것이 현명한 선택입니다.");
		
		// 4. 종료
		System.exit(0);
	}

}
