package src.kr.co.khedu.phone_project4step_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PhoneMain {

	public static Scanner sc = new Scanner(System.in);
	//메인시작
	public static void main(String[] args) {
		HashMap<String, Phone> list = new HashMap<String, Phone>();
		boolean exitFlag = false;
		int inputNumber = 1; 
		

		while (!exitFlag) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine(); // 입력버퍼 클리어
			switch (menu) {
			case Menu.INPUT:
				inputNumber = inputData(); //1.일반, 2.대학, 3.회사
				insertData(list, inputNumber);
				break;
			case Menu.SEARCH:
				System.out.print("찾을사람의 전화번호를 입력하세요. ");
		        String phoneNumber1 = sc.nextLine();
		        Phone phone = searchData(list, phoneNumber1);
		        System.out.println((phone != null)?(phone):("찾는번호가 없어요"));
				break;
			case Menu.DELETE:
				System.out.print("삭제할 전화번호를 입력하세요. ");
		        String phoneNumber2 = sc.nextLine();
		        boolean deleteFlag = deleteData(list, phoneNumber2);
		        System.out.println((deleteFlag == true)?("삭제성공"):("삭제실패 전화번호입력점검"));
				break;
			case Menu.PRINT:
				printList(list); 
				break;
			case Menu.EXIT:
				System.out.println("종료");
				exitFlag = true;
				break;
			default:
				break;
			}
		} // end of for
		System.out.println("The end");
	}// end of main

	//1.일반, 2.대학, 3.회사
	private static int inputData() {
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택:");
		int num = sc.nextInt(); 
		sc.nextLine();
		return num; 
	}

	//리스트출력
	private static void printList(HashMap<String, Phone> list) {
		for(String key : list.keySet()) {
			System.out.println(list.get(key));
		}
	}

	//메뉴선택
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 출력");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static boolean deleteData(HashMap<String, Phone> list, String phoneNumber) {
		boolean deleteFlag = false; 
		
		Set <String> set = list.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String strKey = it.next();
			if (strKey.equals(phoneNumber)) {
				list.remove(strKey);
				deleteFlag = true;
				break;
			}
		}
		
        return deleteFlag; 
    }

	//리스트입력(전화번호 중복입력 불가처리함)
	public static void insertData(HashMap<String, Phone> list, int inputNumber) {
		//System.out.print("이름 : ");
		String name = makeName();  	// sc.nextLine();
		String phoneNumber = null; 
		boolean dupleflag = false;
		//	for(;true;) {
			//System.out.print("전화번호 : ");
			//이번호가 존재하는지를 찾을것
			//Phone pi = searchData(list, phoneNumber);
			//if(pi == null) {
			//	break; 
			//}
			//System.out.println("이미존재하는 전화번호입니다. 다시입력바람");
		//	}
		
		switch(inputNumber) {
		case 1:			//일반
			//System.out.print("생년월일 : ");
			String birthday = makeBirth(); 		//sc.nextLine();
			PhoneInfo pi = new PhoneInfo(name, phoneNumber, birthday);
			//HashSet<Phone> list = new HashSet<Phone>();
			//중복이 일어나면 add => false, 삽입이성공(중복이업다) : add = true
			
		
			if(list.put(phoneNumber, pi) != null) {
				System.out.println("이미존재하는 전화번호입니다. 다시입력바람");
				dupleflag = true;
			}
			System.out.println(pi);
			break;
		case 2:  		//대학생
			System.out.print("전공:");
			String major = sc.nextLine();
			//학년
			int year = (int)(Math.random()*(4-1+1)+1); 
			PhoneUnivInfo pui = new PhoneUnivInfo(name, phoneNumber, major, year);
			if(list.put(phoneNumber, pui) == null) {
				System.out.println("이미존재하는 전화번호입니다. 다시입력바람");
				dupleflag = true;
			}
			System.out.println(pui);
			break; 
		case 3:			//회사원
			System.out.print("회사:");
			String company = sc.nextLine();
			PhoneCompanyInfo pci = new PhoneCompanyInfo(name, phoneNumber, company);
			if(list.put(phoneNumber, pci) != null) {
				System.out.println("이미존재하는 전화번호입니다. 다시입력바람");
				dupleflag = true;
			}
			System.out.println(pci);
			break;
		default:
			return; 
			//중복이 일어나면 dupleflag => true
			//중복이 일어나지 않으면
			
		}
	}
	
	//번호검색(있으면 해당객체리턴, 없으면 null 리턴한다)
	public static Phone searchData(HashMap<String, Phone> list, String phoneNumber) {
		Phone phone = null; 
		//Map에 key객체를 => Set 변경
		Set<String> set = list.keySet();
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String strKey = it.next();
			if(strKey.equals(phoneNumber)) {
				phone = list.get(strKey);
				break;
			}
		}
        return phone; 
	}

	//전화번호생성
	public static String makeNumber() {
        List<String> no0 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        String s = new String("010-"); 
        for(int i=0;i<7;i++) {
        	Collections.shuffle(no0);
        	s += no0.get(i); 
        	if(i==2) {
        		s += "-"; 
        	}
        }
        
        return s; 
    }
	
	//생일날짜생성
    public static String makeBirth() {
        int year = (int)(Math.random()*(2024-1920+1)+1920);
        int month = (int)(Math.random()*(12-1+1)+1);
        int day = (int)(Math.random()*(31-1+1)+1);
        //최종본 랜덤1900~2024+"년 "+랜덤 1~12+" "+랜덤 1~31+"일"
        return year+"/"+month+"/"+day;
    }
    
    //이름생성
    public static String makeName() {
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
		        "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
		        "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
		        "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
		        "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");
		
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
}