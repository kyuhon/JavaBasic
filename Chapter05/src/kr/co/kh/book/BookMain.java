package kr.co.kh.book;
// null은 객체참조변수에 아무것도 없다는것을 뜻함

import java.util.Scanner;

public class BookMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		Book[] bookArray = new Book[20];
		// 확장하는데 최악의 프로그램 -> 나중에 컬렉션 프레임워크 사용?
		
		
		for(;!exitFlag;) {
		dispMenu();
		int menuNo = scan.nextInt();
		
		
		switch(menuNo) {
		case 1 : 
			insertBook(bookArray);
			break;
		case 2 : 
			findBooks(bookArray);
			break;
		case 3 : 
			printBooks(bookArray);
			break;
		case 4 : 
			exitFlag = true;
			System.out.println("프로그램 종료");
			break;
						}
					}
		
		System.out.println("The end");
	}
	
		public static void dispMenu() {
			//화면메뉴출력
			System.out.println("===================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("===================");
			System.out.print("번호를 입력하시오:");
	}
		
		public static void insertBook(Book[] bookArray) {
			System.out.print("번호를 입력하세요:");
			int no = scan.nextInt();//엔터는 버퍼에 남아있다
			System.out.print("제목을 입력하세요:");
			scan.nextLine();//버퍼없앰
			String title = scan.nextLine();
			System.out.println("평점:");
			int score = scan.nextInt();
			Book book = new Book(no,title,score);
			bookArray[no-1] = book;
		}
	
		public static void findBooks(Book[] bookArray) {
			boolean findFlag = false;
			System.out.print("검색 제목:");
			scan.nextLine();
			String title = scan.nextLine();
			for(int i=0;i<bookArray.length;i++) {
				if(bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
					System.out.println("고객님 찾는책 =" + bookArray[i].toString());
					findFlag = true;
					break;
				}
			}
			if(findFlag == false) {
				System.out.println(""+title+" 책은 없습니다.");
			}
		}
		public static void printBooks(Book[] bookArray) {
			for(int i=0;i<bookArray.length;i++) {
				if(bookArray[i] == null) {
					continue;
				}
				System.out.println(bookArray[i].toString());
		}
	}
}
