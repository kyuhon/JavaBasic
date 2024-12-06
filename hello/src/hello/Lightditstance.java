package hello;

import java.util.Scanner;

public class Lightditstance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int days = scanner.nextInt();
		final double lightSpeed = 3e5;
		double distance;
		
		distance = lightSpeed * days * 24 * 60 * 60;
		System.out.println("빛이 1년 동안 가는거리:"+ days + distance + " km.");

	}

}
