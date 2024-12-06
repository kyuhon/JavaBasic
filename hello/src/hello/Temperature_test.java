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

public class Temperature_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;
		double fahrenheit = 0, celsius = 0;
		
		System.out.println("============");
		System.out.println("1.화씨 -> 섭씨");
		System.out.println("2.섭씨 -> 화씨");
		System.out.println("============");
		System.out.print("번호를 선택하시오:");
		select = scanner.nextInt();
				
		if(select == 1) {
			System.out.print("화씨온도를 입력하시오:");
			fahrenheit = scanner.nextDouble();
			
			celsius = (fahrenheit - 32)	/ 1.8;
			System.out.println("섭씨온도는 "+celsius+"");
		}else {
			System.out.print("섭씨온도를 입력하시오:");
			celsius = scanner.nextDouble();
			
			fahrenheit = celsius * 1.8 + 32;
			System.out.println("화씨온도는 "+fahrenheit+"");
					
			
		}
		
		
		System.out.println("The end");
	}

}
