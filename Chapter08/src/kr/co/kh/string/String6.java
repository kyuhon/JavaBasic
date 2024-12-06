package kr.co.kh.string;

public class String6 {

	public static void main(String[] args) {
		
		String data = "aAbBcC";
		
		System.out.println(data.toLowerCase());
		
		
		String data2 = "The cat is on the table";
		
		System.out.println(data2.indexOf("table"));
		String[] dataArray = data2.split(" ");
		for(int i =0; i<dataArray.length;i++) {
			System.out.println(dataArray[i]);
		}
		
		for(String value : dataArray) {
			System.out.println(value);
		}
	}


}
