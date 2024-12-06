package kr.co.kh.electriccar;

import java.util.Scanner;

public class ElectricCarMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		ElectricCar ecar = ElectricCar.getInstance();
		int data = 0;
		
		System.out.print("몇 km 운행하기를 희망하나요?");
		data = scan.nextInt();
		
		System.out.println("자동차 운행시작");
		for(;true;) {
			Thread.sleep(1000);
			ecar.drive();
			ecar.dispDistance();
			ecar.dispBattery();
			//System.out.println(ecar.dispDistance());
			//출력문 안에 또 출력문을 사용하기 때문에 오류
			if(ecar.getBattery() <= 0 || ecar.getDistance() == data) {
				System.out.println("자동차는 멈춤");
				break;
			}
		}
		System.out.println("the end");
		
	}

}
