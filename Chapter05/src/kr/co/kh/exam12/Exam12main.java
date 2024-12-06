package kr.co.kh.exam12;

public class Exam12main {

	public static void main(String[] args) {

		//디생 Exam12
		int sum = 0;
		exam12 e12 = new exam12();
		
		sum = e12.sum(10, 20);
		System.out.println("sum = e12.sum(10, 20) , " + sum);
		
		sum = e12.sum(10, 20, 30);
		System.out.println("sum = e12.sum(10, 20, 30) , " + sum);
		
		
	}

}
