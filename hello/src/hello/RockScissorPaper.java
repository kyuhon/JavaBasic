package hello;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		
		//변수, 상수
		final int scissor = 0;
		final int rock = 1;
		final int paper = 2;
		
		//계산처리
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		double user = scan.nextInt();
		
		int computer = (int) (Math.random()*(3));
		System.out.println(computer);

		if (user == computer) {
			System.out.println("비김");
		} else if (user == (computer+1)%3) {
			System.out.println("인간 승리");
		} else {
			System.out.println("컴퓨터 승리");
		}
		
		

	}

}
