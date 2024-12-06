package kr.co.kh.flyable;

public class Car extends Object{
	
	private int speed;

	public Car(int speed) {
		super();
		this.speed = speed;
		System.out.println("Car 생성자");
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
