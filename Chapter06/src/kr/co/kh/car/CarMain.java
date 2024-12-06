package kr.co.kh.car;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar(100,90);
		
		System.out.println(ec.getSpeed());
		
		
		Car car = new Car(150);
	}

}
