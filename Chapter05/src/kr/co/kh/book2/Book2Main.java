package kr.co.kh.book2;

import java.util.Scanner;

public class Book2Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book2[] Book2Array = new Book2[20];
		boolean x = false;

		for (;!x;) {
			System.out.println("==================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("==================");
			System.out.print("번호를 입력하시오:");
			int no = scan.nextInt();

			switch (no) {
			case 1:
				System.out.print("등록할 책 번호를 입력하시오:");
				int num = scan.nextInt();
				System.out.print("제목을 입력하세요:");
				scan.nextLine();
				String title = scan.nextLine();
				System.out.print("평점을 입력하세요:");
				int score = scan.nextInt();
				Book2 bk = new Book2(num, title, score);
				System.out.print(bk.toString());
				Book2Array[num] = bk;
				break;
				
			case 2:
				boolean y = false;
				System.out.println("검색 제목:");
				scan.nextLine();
				title = scan.nextLine();
				for (int i = 0; i < Book2Array.length; i++) {
					if (Book2Array[i] != null && Book2Array[i].getTitle().equals(title)) {
						System.out.println("고객님 찾는책 =" + Book2Array[i].toString());
						y = true;
						break;
					}
				}
				if (y == false) {
					System.out.println("" + title + " 책은 없습니다");
				}
				break;
			case 3:
				for (int i = 0; i < Book2Array.length; i++) {
					if (Book2Array[i] == null) {
						continue;
					}
					System.out.println(Book2Array[i].toString());
				}
				break;
			case 4:
				x = true;
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("The end");
	}

}
