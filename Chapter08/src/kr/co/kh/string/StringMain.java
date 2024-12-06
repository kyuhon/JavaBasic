package kr.co.kh.string;

public class StringMain {

	public static void main(String[] args) {
		String data = new String("abcdefg");
		String data2 = "abcdefg";
		String data3 = new String("abcdefg");
		String data4 = "abcdefg";
		
		//힙영역에 문자열 객체가 3개 만들어진다
		//data2와 data4의 주소는 같다
		
		System.out.println(System.identityHashCode(data));
		System.out.println(System.identityHashCode(data2));
		System.out.println(System.identityHashCode(data3));
		System.out.println(System.identityHashCode(data4));
		
		
	}

}
