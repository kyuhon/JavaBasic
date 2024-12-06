package kr.co.kh.student2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student2Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Student2> stu = new ArrayList<Student2>();
		boolean x = false;
		
		for(;!x;) {
		dispMenu();
		int no = scan.nextInt();
		
		switch(no) {
		case 1 :
			insertTotal(stu);
			break;
		case 2 :
			searchScore(stu);
			break;
		case 3 :
			printTotal(stu);
			break;
		case 4 :
			deleteScore(stu);
			break;
		case 5 :
			modifyScore(stu);
			break;
		case 6 :
			Collections.sort(stu);
			System.out.println("성적순위변경");
			break;
		case 7 :
			x = true;
			System.out.println("시스템종료");
			break;
		default :
			break;
			}
		}
		System.out.println("the end");
	}
	
	public static void dispMenu() {
		System.out.println("\n======================");
		System.out.println("1. 성적 입력하기");
		System.out.println("2. 성적 검색하기");
		System.out.println("3. 전체 출력하기");
		System.out.println("4. 성적 삭제하기");
		System.out.println("5. 성적 수정하기");
		System.out.println("6. 성적 순위보기");
		System.out.println("7. 종료하기");
		System.out.println("======================\n");
		System.out.print("번호를 입력하시오:");
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
	
	public static void insertTotal(ArrayList<Student2> stu) {
		int num = (int)(Math.random()*(20000-10000-1)+10000);
		String name = nName();
		int kor = (int)(Math.random()*(100)+1);
		int eng = (int)(Math.random()*(100)+1);
		int math = (int)(Math.random()*(100)+1);
		int sum = kor + eng + math;
		double avr = sum / 3.0 ;
		Student2 study = new Student2(num,name,kor,eng,math);
		study.changeSum();
		study.changeAvr();
		stu.add(study);
		System.out.println(study.toString());
	}
	
	public static void searchScore(ArrayList<Student2> stu) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번을 입력하시오:");
		String name = scan.nextLine();
		boolean y = false;
		for(int i = 0;i<stu.size();i++) {
			if(stu.get(i).getName().equals(name)) {
				System.out.println(stu.get(i));
				y = true;
			}
		}
		if(y==false) {
			System.out.println("해당 "+name+"을 찾을 수 없습니다");
		}
	}
	
	public static void printTotal(ArrayList<Student2> stu) {
		for(int i = 0;i<stu.size();i++) {
			System.out.println(stu.get(i).toString());
		}
	}
	
	public static void deleteScore(ArrayList<Student2> stu) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번을 입력하시오:");
		int num = scan.nextInt();
		boolean y = false;
		for(int i = 0;i<stu.size();i++) {
			if(stu.get(i).getNum() == num) {
				stu.remove(i);
				System.out.println("삭제완료");
				y = true;
			}
		}
		if(y==false) {
			System.out.println("해당학번없음");
		}
	}
	
	public static void modifyScore(ArrayList<Student2> stu) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하시오:");
		int num = scan.nextInt();
		boolean y = false;
		for(int i =0;i<stu.size();i++) {
			if(stu.get(i).getNum() == num) {
				System.out.println("국어점수:"+stu.get(i).getKor()+"수정할점수:");
				int kor = scan.nextInt();
				System.out.println("영어점수:"+stu.get(i).getEng()+"수정할점수:");
				int eng = scan.nextInt();
				System.out.println("수학점수:"+stu.get(i).getMath()+"수정할점수:");
				int math = scan.nextInt();
				stu.get(i).setKor(kor);
				stu.get(i).setEng(eng);
				stu.get(i).setMath(math);
				stu.get(i).changeSum();
				stu.get(i).changeAvr();
				y = true;
				System.out.println("수정완료");
			}
		}
	}
	
}
