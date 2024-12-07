package array;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		
		System.out.print("양의 정수를 입력하시오:");
		x = scan.nextInt();
		
		System.out.println(""+x+"의 약수는 다음과 같습니다.");
		for (int i=1;i<=x;i++) {
			if(x%i==0) {
				System.out.println(""+ i);
			}
		}
	}
}