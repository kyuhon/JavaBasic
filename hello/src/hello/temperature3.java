package hello;

import java.util.Scanner;

/* 1. 화씨->섭씨
2. 섭씨->화씨

화씨 fahrenheit
섭씨 celsius

F = C*1.8 + 32
번호를 선택하시오: 1
화씨온도를입력하시오: 100.0
섭씨온도는 37.77777777777778 
if(번호 == 1) {
	1. 화씨 -> 섭씨 코드구현
}else{
	2. 섭씨 -> 화씨 코드구현
}

*/
 
public class temperature3 {

	public static void main(String[] args) {
		//1.변수,상수
		Scanner scanner = new Scanner(System.in);
		int select=0;
		double fahrenheit = 0.0, celsius = 0.0;
        //2. 계산처리
		//입력
		System.out.println("=============");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=============");
		System.out.print("번호를 선택하시오:");
		select = scanner.nextInt();
		//선택
		if(select == 1) {
			System.out.print("input celsius value :");
			celsius = scanner.nextDouble();
			fahrenheit = celsius * (9.0 / 5.0) + 32.0;
			System.out.println("섭씨온도 "+celsius+"를 화씨온도 변환되는 값은 "+fahrenheit+"입니다.");
			
		}else {
			System.out.print("input fahrenheit value:");
			fahrenheit = scanner.nextDouble();
			celsius = (fahrenheit - 32) / 1.8;
	        System.out.println("화씨온도 "+fahrenheit+"를 섭씨온도로 변환되는 값은 "+celsius+"입니다");
	        
		}
        //3. 출력
        //4. 종료
		System.out.println("The end"); 
	}

}
