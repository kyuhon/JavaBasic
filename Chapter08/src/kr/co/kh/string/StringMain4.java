package kr.co.kh.string;

public class StringMain4 {

	public static void main(String[] args) {
		String data1 = "abcdefg";
		String data2 = "12345";
		
		String data3 = data1.concat(data2);
		String data4 = data1 + data2;
		System.out.println(data3);
		System.out.println(data4);
	}

}
