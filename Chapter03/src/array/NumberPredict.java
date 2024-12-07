package hello;

import java.util.Scanner;

public class NumberPredict {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		
				
		int x = (int)(Math.random()*(100)+1);
		
		
		for(int i = 0; i < 100; i++) {
			System.out.print("정답을 추측하여 보시오:");
			input = scan.nextInt();
			count++;
			
			if(input == x) {
				System.out.println("축하합니다. 시도횟수는 "+count+"");
				break;
			}
			
			String message = (input > x)?("높습니다"):("작습니다");
			
		/*	else {
				if(input<x) {
					System.out.println("제시한 정수가 낮습니다.");
				}
				if(input>x) {
					System.out.println("제시한 정수가 높습니다.");
				}	*/
				
				
			}
			
		}
		
		
	}


