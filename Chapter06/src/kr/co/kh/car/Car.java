package kr.co.kh.car;

public class Car extends Object{
	private int speed;

	public Car(int speed) {
		super();
		System.out.println("Car 객체생성");
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	
	
}
