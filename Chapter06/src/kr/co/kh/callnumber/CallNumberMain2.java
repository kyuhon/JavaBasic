package kr.co.kh.callnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CallNumberMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean x = false;
		ArrayList<CallNumber> cn = new ArrayList<CallNumber>();
		
		for(;!x;) {
			dispMenu();
			System.out.print("번호를 입력하시오: ");
			int no = scan.nextInt();
			
			switch(no) {
			case 1 :
				insertName(cn);
				break;
			case 2 :
				searchCallNum(cn);
				break;
			case 3 :
				printTotal(cn);
				break;
			case 4 :
				deleteCallNum(cn);
				break;
			case 5 :
				modifyCallNum(cn);
				break;
			case 6 :
				break;
			}
		}
		
		
	}

	public static void dispMenu() {
		
		System.out.println("\n=================");
		System.out.println("1. 전화번호부 추가하기");
		System.out.println("2. 전화번호부 검색하기");
		System.out.println("3. 전체출력하기");
		System.out.println("4. 전화번호부 삭제하기");
		System.out.println("5. 전화번호부 수정하기");
		System.out.println("6. 종료하기");
		System.out.println("=================\n");
	}
	
	public static String nName() {
		String[] name = new String[] {};
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
		        "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
		        "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
		        "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
		        "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");
		List<String> 성2 = Arrays.asList(name);
		List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
		        "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
		        "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
		        "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
		        "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
		        "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
		        "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
		        "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
		        "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
		        "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
		    Collections.shuffle(성);
		    Collections.shuffle(이름);
		    return 성.get(0) + 이름.get(0) + 이름.get(1);
	}
	
	public static void insertName(ArrayList<CallNumber> cn) {
		String name = nName();
		int age = (int)(Math.random()*(100)+1);
		int callnum = (int)(Math.random()*(99999999)+10000000);
		CallNumber asdf = new CallNumber(name,age,callnum);
		cn.add(asdf);
		System.out.println(asdf.toString());
	}
	
	public static void searchCallNum(ArrayList<CallNumber> cn) {
		Scanner scan = new Scanner(System.in);
		boolean x = false;
		System.out.print("검색할 성명을 작성하시오:");
		String name = scan.nextLine();
		for(int i =0;i<cn.size();i++) {
			if(cn.get(i).getName() == name) {
				System.out.println(cn.get(i));
				x=true;
			}
		}
		if(x==false) {
			System.out.println("해당 전화번호를 찾을 수 없습니다");
		}
	}
	
	public static void printTotal(ArrayList<CallNumber> cn) {
		for(int i =0;i<cn.size();i++) {
			System.out.println(cn.get(i).toString());
		}
	}
	
	public static void deleteCallNum(ArrayList<CallNumber> cn) {
		Scanner scan = new Scanner(System.in);
		boolean x = false;
		System.out.print("삭제할 성명을 작성하시오:");
		String name = scan.nextLine();
		for(int i =0;i<cn.size();i++) {
			if(cn.get(i).equals(name)) {
				cn.remove(i);
				System.out.println("삭제완료");
				x=true;
			}
		}
		if(x==false) {
			System.out.println("해당 전화번호를 찾을 수 없습니다");
		}
	}
	
	public static void modifyCallNum(ArrayList<CallNumber> cn) {
		
	}
}
