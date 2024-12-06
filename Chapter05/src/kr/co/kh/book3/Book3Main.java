package kr.co.kh.book3;

import java.util.Scanner;

public class Book3Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Book3[] bookarray = new Book3 [20];
		
		
		
		System.out.println("=======================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("=======================");
		System.out.println("번호를 입력하시오:");
		int data = scan.nextInt();
		
		switch(data) {
		case 1:
			System.out.println("등록할 책 번호를 입력하시오:");
			int num = scan.nextInt();
			System.out.println("등록할 책 이름을 입력하시오:");
			String title = scan.nextLine();
			System.out.println("책의 평점을 입력하시오:");
			int score = scan.nextInt();
			Book3 bk = new Book3(num,title,score);
			bookarray[num] = bk;
			break;
		case 2:
			System.out.println("검색할 책의 이름을 입력하시오:");
			title = scan.nextLine();
			for(int i=0;i<bookarray.length;i++) {
				
			}
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

}
