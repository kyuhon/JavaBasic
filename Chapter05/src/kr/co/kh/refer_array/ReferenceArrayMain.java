package kr.co.kh.refer_array;

import java.util.Scanner;

public class ReferenceArrayMain {

	public static void main(String[] args) {
		
		//정수형 참조배열
		Scanner scan = new Scanner(System.in);
		int[] ia = new int[3];
		for(int i=0;i<ia.length;i++) {
			ia[i] = 10*(i+1);
		}
		for(int i=0;i<ia.length;i++) {
			System.out.print("ia["+i+"] = "+ia[i]+"" + " ");
		}
		//Rectangle 클래스 참조배열
		System.out.println();
		Rectangle[] ra = new Rectangle[3];
		for(int i=0;i<ra.length;i++) {
			System.out.print(i+"번째 height 입력: ");
			int height = scan.nextInt();
			System.out.print(i+"번째 width 입력: ");
			int width = scan.nextInt();
			ra[i] = new Rectangle(height,width);
		}
		System.out.println();
		for(int i=0;i<ia.length;i++) {
			System.out.println("ra["+i+"] = "+ra[i]);
			System.out.println(ra[i].getArea());
		}
	}

}
