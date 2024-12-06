package kr.co.kh.flyable;

import java.util.ArrayList;

public class FlyableMain {

	public static void main(String[] args) {
		FlyingCar fc = new FlyingCar(100, 100000);
		Car car = fc;
		Flyable fa = fc;
		
		car.setSpeed(200);
		System.out.println("speed" +fc.getSpeed());
	
		fa.fly(); //부.추상메소드 => 자식 오버라이딩함수 작동
		
		
		System.out.println("==========================");
		ArrayList<Flyable> list = new ArrayList<Flyable>();
		
		list.add(new FlyingCar(100, 100000));
		list.get(0).fly();
		
		System.out.println("PI = "+ Flyable.PI);
	}
	
	

}
