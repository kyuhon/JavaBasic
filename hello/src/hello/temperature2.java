package hello;

import java.util.Scanner;

public class temperature2 {

	public static void main(String[] args) {

		//1.변수,상수
		Scanner scanner = new Scanner(System.in);
		
		double fahrenheit = 0.0, celsius = 0.0;
		
        //2. 계산처리
		System.out.print("input fahrenheit value:");
		fahrenheit = scanner.nextDouble();
		
		celsius = (fahrenheit - 32) / 1.8;
		
		
        //3. 출력
        System.out.println("화씨온도 "+fahrenheit+"를 섭씨온도로 변환되는 값은 "+celsius+"입니다");
        
        //4. 종료
		
	}

}
