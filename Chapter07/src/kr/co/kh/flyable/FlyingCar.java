package kr.co.kh.flyable;

public class FlyingCar extends Car implements Flyable {
	private int price;
	
	public FlyingCar(int speed, int price) {
		super(speed);
		this.price = price;
		System.out.println("FlyingCar 생성자");
	}

	@Override
	public void fly() {
		System.out.println("FlyingCar 다형성구현을 진행했습니다");
	}

}
