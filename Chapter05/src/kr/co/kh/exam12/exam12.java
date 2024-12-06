package kr.co.kh.exam12;

  //2개의 정수의 합을 구하는 sum()과 3개의 정수의 합을 구하는 sum()을 메소드 오버로딩을 이용하여 정의하라.
public class exam12 {

	//멤버변수
	private int num1;
	private int num2;
	private int num3;
    //생성자오버로딩(디생, 매생)
	public exam12() {}
	public exam12(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	//캡슐화(setter,getter)
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	@Override
	public String toString() {
		return " num1=" + num1 + ", num2=" + num2 + ", num3=" + num3;
	}
	
    //연산함수 연산함수 sum 오버로딩
	public int sum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return this.num1 + this.num2;
	}
	public int sum(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		return this.num1 + this.num2 + this.num3;
	}
	
    //출력함수(멤버변수모두출력하는기능)
	
}
