package kr.co.kh.exam21;

import java.util.Scanner;

public class Exam21Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] h2b = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"};
		
		System.out.print("값을 입력요망:");
		String data = scan.nextLine();
		System.out.println(data +"는 16진수 변환하면");
		for(int i =0;i<4;i++) {
			char value = data.charAt(i);
			int num = 0;
			if(value>='0' && value <= '9') {
				num = value - '0';
			}else if(value >= 'a' && value <= 'f') {
				num = value - 'a' + 10;
			}
			System.out.println(h2b[num]+" ");
		}
		
		//문자는 숫자로 바뀔 수있다 - > 아스키 코드값으로
	}

}
