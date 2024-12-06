package hello;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {

		System.out.println("원의 반지름을 적으시오");
		
		Scanner scanner = new Scanner(System.in);
		
		int radius = scanner.nextInt();
		final double PI = 3.141592;
		double area = PI * radius * radius;
		
		System.out.println("반지름이" + radius + "인 원의 면적은"+ area);
		
		
	}

}
