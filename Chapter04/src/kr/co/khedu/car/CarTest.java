package kr.co.khedu.car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("빨간색");
		car.setSpeed(100);
		car.setGear(4);
		
		car.speedUp();
		car.speedDown();
		car.changeGear(5);
		System.out.println(car.toString());
		
		Car car2 = new Car("검정색", 200, 2);
		System.out.println(car2.toString());
	}

}
