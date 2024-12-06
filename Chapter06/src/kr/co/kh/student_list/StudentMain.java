package kr.co.kh.student_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//Student[] studentArray = new Student[30];
		ArrayList<Student> stuList = new ArrayList<Student>();
		boolean exitFlag = false;

		for (; !exitFlag;) {
			// 메뉴보여줘
			menuDisplay();
			// 메뉴선택
			int menu = scan.nextInt();
			// 메뉴에 따라 프로그램 진행해야돼
			switch (menu) {
			case 1:
				insertStudent(stuList);
				break;
			case 2:
				findStudent(stuList);
				break;
			case 3:
				printAllStudent(stuList);	
				break;
			case 4:
				removeStudent(stuList);
				break;
			case 5:
				modifyStudent(stuList);
				break;
			case 6:
				System.out.println("성적 순위보기");
				Collections.sort(stuList);
				System.out.println("성적순으로 정렬되었습니다");
				break;
			case 7:
				exitFlag = true;
				break;
			default:
				break;
			}

		} // end of for
		System.out.println("The end");
	}// end of main

	public static void menuDisplay() {
		System.out.println("\n====================");
		System.out.println("1. 성적 입력하기");
		System.out.println("2. 성적 검색하기");
		System.out.println("3. 전체 출력하기");
		System.out.println("4. 성적 삭제하기");
		System.out.println("5. 성적 수정하기");
		System.out.println("6. 성적 순위보기");
		System.out.println("7. 종료하기");
		System.out.println("====================\n");
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
	
	public static void insertStudent(ArrayList<Student> stuList) {

		int number = (int) (Math.random() * (20000 - 10000 + 1) + 10000);
		String name = nName();
		int kor = (int) (Math.random() * (100 - 50 - 1) + 50);
		int eng = (int) (Math.random() * (100 - 50 - 1) + 50);
		int math = (int) (Math.random() * (100 - 50 - 1) + 50);
		Student stu = new Student(number, name, kor, eng, math);
		stu.changeSum();
		stu.changeAverage();
		stuList.add(stu);
		System.out.println(stu.toString()+"입력완료");
	}
	public static void printAllStudent(ArrayList<Student> stuList) {
		for(int i=0;i<stuList.size();i++) {
			if(stuList.get(i)!= null) {
				System.out.println(stuList.get(i));
			}else {
				continue;
			}
		}
	}
	public static void findStudent(ArrayList<Student> stuList) {
		System.out.println("성적 검색하기");
		System.out.println("학번을 입력하시오:");
		int num = scan.nextInt();
		boolean findFlag = false;
		for(int i =0;i<stuList.size();i++) {
			if(stuList.get(i).getNum() == num) {
				System.out.println(stuList.get(i));
				findFlag = true;
			}
		}
		if(findFlag == false) {
			System.out.println("해당된 "+num+"을 찾을 수 없습니다");
		}
	}
	public static void removeStudent(ArrayList<Student> stuList) {
		System.out.println("성적 삭제하기");
		System.out.println("학번을 입력하시오 :");
		int num = scan.nextInt();
		boolean findFlag = false;
		for(int i=0;i<stuList.size();i++) {
			if(stuList.get(i).getNum() == num) {
				stuList.remove(i);
				System.out.println("데이터를 삭제했습니다");
				findFlag = true;
				break;
			}
		}
		if(findFlag == false) {
			System.out.println(""+num+"는 없는 학번입니다");
		}
	}
	public static void modifyStudent(ArrayList<Student> stuList) {
		System.out.println("학번을 입력하시오 :");
		int num = scan.nextInt();
		boolean findFlag = false;
		for(int i=0;i<stuList.size();i++) {
			if(stuList.get(i).getNum() == num) {
			System.out.println("국어["+stuList.get(i).getKor()+"]:");
			int kor = scan.nextInt();
			System.out.println("수학["+stuList.get(i).getMath()+"]:");
			int math = scan.nextInt();
			System.out.println("영어["+stuList.get(i).getEng()+"]:");
			int eng = scan.nextInt();
			stuList.get(i).setKor(kor);
			stuList.get(i).setMath(math);
			stuList.get(i).setEng(eng);
			stuList.get(i).changeSum();
			stuList.get(i).changeAverage();
			findFlag = true;
			System.out.println("변경 완료");
			break;
		}
			if(findFlag == false) {
				System.out.println(""+num+"는 없는 학번입니다");
			}
		}
	}

}