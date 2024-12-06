package hello;

import java.util.Scanner;

public class Data4 {

	public static void main(String[] args) {
		
		// 1. 변수, 상수
		int data = 0;
		String scoreGrade = null;
		// 2. 계산처리
		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하시오:");
		data = scanner.nextInt();
		
		// if문으로 표현
		if(data <=100 && data >= 90) {
			scoreGrade = "A학점";
			}
			else if(data < 90 && data > 80) {
				scoreGrade = "B학점";
			
			}else if(data < 80 && data > 70) {
			scoreGrade = "C학점";
			
			}else if(data < 70 && data > 60) {
				scoreGrade = "D학점";
		
			} else {
				scoreGrade = "F학점";
			} 
		System.out.println("학점 : "+scoreGrade+"");
	}

}
