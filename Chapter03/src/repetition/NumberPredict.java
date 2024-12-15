package repetition;

import java.util.Scanner;

public class NumberPredict {

	public static void main(String[] args) {
		
		
		//Math.random 함수를 사용해서 1부터 100사이의 랜덤 정수를
		//선택하게 해서 10번의 기회동안 맞출 수 있게 한 코딩
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		
				
		int x = (int)(Math.random()*(100)+1);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print("정답을 추측하여 보시오:");
			input = scan.nextInt();
			count++;
			
			if(input == x) {
				System.out.println("축하합니다. 시도횟수는 "+count+"");
				break;
			}
			String message = (input > x)?("높습니다"):("작습니다");
			System.out.println(message);
			
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


