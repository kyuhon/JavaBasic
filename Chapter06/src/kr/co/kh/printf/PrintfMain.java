package kr.co.kh.printf;

public class PrintfMain {

	public static void main(String[] args) {
		double num1 = 5.0;
		double num2 = 3.0;
		System.out.println(num1/num2);
		
		System.out.printf("%.2f", num1/num2);
		
		System.out.println();
		
		String data = String.format("%.2f", num1/num2);
		System.out.println("data = "+data);
	}

}
