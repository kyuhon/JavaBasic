package kr.co.kh.phone;

import java.util.ArrayList;
import java.util.Scanner;


public class PhoneBookManager {
	Scanner scan = new Scanner(System.in);
	private int count =0;
	ArrayList<PhoneInfo> pn = new ArrayList<PhoneInfo>(100);
	
	public PhoneBookManager() {
	}

	public void insertData() {
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = scan.nextLine();
		System.out.print("생년월일 :" );
		String birthday = scan.nextLine();
		PhoneInfo pio = new PhoneInfo(name, phoneNumber, birthday);
		pn.add(pio);
		System.out.println("데이터의 입력이 완료되었습니다");
	}
	
	public void searchData() {
		boolean findFlag = true;
		System.out.println("데이터 검색을 시작합니다.");
		System.out.println("이름 : ");
		String name = scan.nextLine();
			for(int i=0;i<pn.size();i++) {
				if(pn.get(i).getName().equals(name)) {
					System.out.println(pn.get(i));
					findFlag = true;
					break;
				}
			}
			if(findFlag == false) {
				System.out.println(""+name+" 이란 이름은 없습니다.");
			}
	}
	
	public void deleteData() {
		boolean findFlag = true;
		System.out.println("데이터 검색을 시작합니다.");
		System.out.println("이름 : ");
		String name = scan.nextLine();
		for(int i=0;i<pn.size();i++) {
			if(pn.get(i).getName().equals(name)) {
				pn.remove(i);
				findFlag = true;
				break;
			}
		}
		if(findFlag == false) {
			System.out.println(""+name+" 이란 이름은 없습니다.");
		}
	
	}
	
}
