package src.kr.co.khedu.phone_project4step;

public class MenuChoiceException extends Exception {
	//오류가 나왔을 때 저장할 데이터가 있으면 선언하면 됨
	private int wrongMenuNumber;

	//매생
	public MenuChoiceException(int wrongMenuNumber) {
		super();
		this.wrongMenuNumber = wrongMenuNumber;
	}

	//겟터, 셋터
	public int getWrongMenuNumber() {
		return wrongMenuNumber;
	}

	public void setWrongMenuNumber(int wrongMenuNumber) {
		this.wrongMenuNumber = wrongMenuNumber;
	}

	//오버라이딩함수 할게없다, 연산함수
	public void showWrongMenuNumber() {
		System.out.println(this.wrongMenuNumber+"번에 해당되는 메뉴가 없습니다");
	}
	
}
