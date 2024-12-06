package kr.co.kh.phone;

import java.util.Scanner;

public class PhoneNum3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PhoneBookManager pbm = new PhoneBookManager();
		
		boolean a = true;
		
		for(;a;) {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
		int x = scan.nextInt();
		
		switch(x) {
		case 1 : 
			pbm.insertData();
			break;
		case 2 :
			pbm.searchData();
			break;
		case 3 :
			pbm.deleteData();
			break;
		case 4 :
			a = false;
			System.out.println("종료");
			break;
		default :
			System.out.println("잘못된 번호를 입력하셨습니다");
			break;
		}
		}
	}

}
