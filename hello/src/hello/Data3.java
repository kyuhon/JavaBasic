package hello;

import java.util.Scanner;

public class Data3 {

	public static void main(String[] args) {
		
		// 1. 변수, 상수
		int data = 0;
		String scoreGrade = null;
		
		// 2 . 계산처리
		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하시오:");
		data = scanner.nextInt();
	
		//switch case문으로 표현
		switch(data/10){
		
		case 10 : 
			scoreGrade = "A";
			break;
		case 9 :
			scoreGrade = "A";
			break;
		case 8 :
			scoreGrade = "B";
			break;
		case 7 :
			scoreGrade = "C";
			break;
		case 6 :
			scoreGrade = "D";
			break;
		default:
			scoreGrade = "F";
			break;
	
		}
			// 3. 출력
			System.out.println("학점 : "+scoreGrade+"");
		
		}
	}
