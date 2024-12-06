package hello;

import java.util.Scanner;

public class hello7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double x=0.0, y=0.0, z=0.0, sum=0.0;
		
		System.out.print("x값을 입력해주세요");
		x = scanner.nextDouble();
		System.out.print("y값을 입력해주세요");
		y = scanner.nextDouble();
		System.out.print("z값을 입력해주세요");
		z = scanner.nextDouble();
				
		System.out.println(""+x+"+"+y+"+"+z+"="+sum+"");
	}

}
