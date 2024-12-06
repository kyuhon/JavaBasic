package kr.co.kh.phone;

import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = true;
		PhoneInfo pi = new PhoneInfo();
		
		for(;true;) {
		
		System.out.println("선택하세요");
		System.out.println("1. 데이터입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
		int x = scan.nextInt();
		scan.nextLine();
		
		switch(x) {
		case 1 :
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("전화번호 : ");
			String phoneNumber = scan.nextLine();
			System.out.print("생년월일 :" );
			String birthday = scan.nextLine();
			PhoneInfo pio = new PhoneInfo(name, phoneNumber, birthday);
			System.out.println("입력된 정보 출력...");
			pio.showPhoneInfo();
			break;
		case 2 :
			a = false;
			System.out.println("종료");
			break;
		default :
			System.out.println("입력값이 잘못되었습니다");
			break;
		}
		
		}
	}

}
