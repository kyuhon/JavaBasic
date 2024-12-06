package hello;

public class Calculate {

	public static void main(String[] args) {
		
		double sum = (int)(1.2 + 12);
		System.out.println("1.2 + 12 = "+sum+"");
		
		// 산술연산처리방식(이항연산자 -> 산술연산자) / %
		double value = 320 / 60;
		System.out.println("value = "+value+"");
		
		double remain = 320 -(value*60);
		System.out.println("remain = "+remain+"");

		int remain2 = 320%60;
		System.out.println("remain2 = "+remain2+"");
		// 정수형 연산자 정수형 => 정수형
	}

}
