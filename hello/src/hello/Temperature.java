package hello;

// 사용자로부터 화씨온도를 받아서 섭씨온도로 변환해서 출력한다.

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 변수, 상수
			double fahrenheit = 0.0, celsius = fahrenheit;
		// double 화씨온도 = 섭씨온도, 섭씨온도 = 0.0; x
		
		// 2. 계산처리
		//입력처리	
		System.out.println("input celsius value :");
		celsius = scanner.nextDouble();
		//계산처리(화씨)
		fahrenheit = celsius * (9.0 / 5.0) + 32.0;
		
		// 3. 출력
		System.out.println("섭씨온도 "+celsius+"를 화씨온도 변환되는 값은 "+fahrenheit+"입니다.");
		
		// 4. 종료
		System.exit(0);
		
	}

}
