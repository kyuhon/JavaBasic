package hello;

import java.util.Scanner;

public class ScoreAverage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		int score = 0;
		
		for (; score >= 0;) {
			
			System.out.print("점수를 입력하시오:");
			score = scan.nextInt();
			
			sum += score;	
			count++;
		}
			System.out.println("평균은 " + sum /(count-1));
	}	
}
