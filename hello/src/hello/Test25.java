package hello;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// sum+= data sum = sum + data

		double sum = 0.0;
		int n = 0;

		System.out.print("input n value:");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			sum += (double) 1 / i;
		}
		System.out.println("수열의 합은 "+sum+"");
	}

}
