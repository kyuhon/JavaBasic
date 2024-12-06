package kr.co.kh.string;

public class StringMain5 {

	public static void main(String[] args) {
		String data1 = "";
		String data2 = null;
		
		System.out.println(data1.isEmpty()); // true
		//비어있어야 true
		System.out.println(data2.isEmpty());
		//data2에 객체가 없어서 오류
	}

}
