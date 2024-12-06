package kr.co.kh.mymath;

public class MyMathMain {

	public static void main(String[] args) {
		//1단계 구현클래스를 설계해서 - > 객체로 만들기
		MineMath mm = new MineMath();
		mm.calculate(20);
		int value = mm.calculate(20);
		System.out.println("value ="  + value + "");
		
		//2단계 구현클래스를 만들지 않고 인터페이스를 사용한다 -> 임시객체
		//구현클래스 구현참조변수 = new 구현인터페이스();
		
		MyMath mm2 = new MyMath() {
			@Override
			public int calculate(int x) {
				return 0;
			}
		};
		int value2 = mm2.calculate(20);
		System.out.println("value2 ="  + value2 + "");
		
		MyMath mm3 = value3 -  value2
	}

}
