package hello;

import java.util.Scanner;

public class PrintTest {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int x=0,y=0,z=0,sum=0;
			
			System.out.println("input x=");
			x = scan.nextInt();
			System.out.println("input y=");
			y = scan.nextInt();
			System.out.println("input z=");
			z = scan.nextInt();
			
			sum = x+y+z;
			
			System.out.println(""+x+" + "+y+" + "+z+" = "+sum+" 입니다.");
	}

}
