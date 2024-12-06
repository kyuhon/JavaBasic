package kr.co.kh.basketball_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BasketballMain {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<Basketball> bkb = new HashSet<Basketball>();
		HashSet<Basketball> bkb2 = new HashSet<Basketball>();

		boolean exitFlag = true;

		while (exitFlag) {
			viewMenu();
			int menu = sc.nextInt();
			switch (menu) {
			case Menu.INSERT_A:
				AteamSetting(bkb);
				break;
			case Menu.INSERT_B:
				BteamSetting(bkb2);
				break;
			case Menu.GAMEPLAY:
				GamePlay(bkb, bkb2);
				break;
			case Menu.RESULT:
				Result(bkb, bkb2);
				break;
			case Menu.EXIT:
				System.out.println("게임을 종료합니다.");
				exitFlag = false;
				break;
			}
		}
		System.out.println("the end");
	}

	public static void viewMenu() {

		System.out.println("===============");
		System.out.println("\n미니농구게임");
		System.out.println("1. A팀 설정");
		System.out.println("2. B팀 설정");
		System.out.println("3. 게임진행");
		System.out.println("4. 목록과 결과");
		System.out.println("5. 종료\n");
		System.out.println("===============");
		System.out.print("선택 : ");
	}

	public static void AteamSetting(HashSet<Basketball> bkb) {
		for (int i = 0; i < 5; i++) {
			String name = makeName();
			int height = (int) (Math.random() * (30) + 160);
			int age = (int) (Math.random() * (10) + 20);
			BasketballATeam bkba = new BasketballATeam(name, height, age);
			bkb.add(bkba);
			System.out.println(bkba.intro());
		}
	}

	public static void BteamSetting(HashSet<Basketball> bkb2) {
		for (int i = 0; i < 5; i++) {
			String name = makeName();
			int height = (int) (Math.random() * (30) + 160);
			int age = (int) (Math.random() * (10) + 20);
			BasketballBTeam bkbb = new BasketballBTeam(name, height, age);
			bkb2.add(bkbb);
			System.out.println(bkbb.intro());
		}
	}

	public static void GamePlay(HashSet<Basketball> bkb, HashSet<Basketball> bkb2) {
		System.out.println("\n게임 진행 중...");
		int aTeamScore = 0;
		int bTeamScore = 0;

		List<Basketball> aTeam = new ArrayList<>(bkb);
		List<Basketball> bTeam = new ArrayList<>(bkb2);

		// A팀 슛 시도
		for (int i = 0; i < 40; i++) {
			int shotOutcome = (int) (Math.random() * 3); // 0: 실패, 1: 2점 성공, 2: 3점 성공
			Basketball shooter = aTeam.get((int) (Math.random() * bkb.size()));

			if (shotOutcome == 1) {
				System.out.println(shooter.getName() + " (A팀)이 2점 슛을 성공했습니다!");
				shooter.addScore(2);
				aTeamScore += 2;
			} else if (shotOutcome == 2) {
				System.out.println(shooter.getName() + " (A팀)이 3점 슛을 성공했습니다!");
				shooter.addScore(3);
				aTeamScore += 3;
			} else {
				System.out.println(shooter.getName() + " (A팀)이 슛을 실패했습니다.");
			}
		}

		// B팀 슛 시도
		for (int i = 0; i < 40; i++) {
			int shotOutcome = (int) (Math.random() * 3); // 0: 실패, 1: 2점 성공, 2: 3점 성공
			Basketball shooter2 = bTeam.get((int) (Math.random() * bkb2.size()));

			if (shotOutcome == 1) {
				System.out.println(shooter2.getName() + " (B팀)이 2점 슛을 성공했습니다!");
				shooter2.addScore(2);
				bTeamScore += 2;
			} else if (shotOutcome == 2) {
				System.out.println(shooter2.getName() + " (B팀)이 3점 슛을 성공했습니다!");
				shooter2.addScore(3);
				bTeamScore += 3;
			} else {
				System.out.println(shooter2.getName() + " (B팀)이 슛을 실패했습니다.");
			}
		}
		System.out.println("A팀 총 점수: " + aTeamScore);
		System.out.println("B팀 총 점수: " + bTeamScore);
	}

	public static void Result(HashSet<Basketball> bkb, HashSet<Basketball> bkb2) {

		List<Basketball> aTeam = new ArrayList<>(bkb);
		List<Basketball> bTeam = new ArrayList<>(bkb2);

		System.out.println("\nA팀 목록과 결과");
		Collections.sort(aTeam);
		for(Basketball player : aTeam) {
			System.out.println(player);
		}
		Basketball topScorerA = aTeam.get(aTeam.size() - 1);

		System.out.println("\nB팀 목록과 결과");
		Collections.sort(bTeam,Collections.reverseOrder());
		for(Basketball player : bTeam) {
			System.out.println(player);
		}
		Basketball topScorerB = bTeam.get(0);

		System.out.println("\nA팀에서 가장 득점이 높은 선수: " + topScorerA.getName() + ", 득점: " + topScorerA.getScore() + "점");
		System.out.println("B팀에서 가장 득점이 높은 선수: " + topScorerB.getName() + ", 득점: " + topScorerB.getScore() + "점");
	}

	public static String makeName() {
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황",
				"안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성",
				"차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함",
				"변", "염", "양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명",
				"기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구",
				"용");

		List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누",
				"다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민",
				"바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔",
				"수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용",
				"우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정",
				"제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판",
				"하", "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림",
				"봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴",
				"언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란",
				"더", "손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱",
				"평", "늘", "늬", "랑", "얀", "향", "울", "련");
		Collections.shuffle(성);
		Collections.shuffle(이름);
		return 성.get(0) + 이름.get(0) + 이름.get(1);
	}
}
