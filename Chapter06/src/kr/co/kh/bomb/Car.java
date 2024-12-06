package kr.co.kh.bomb;

public class Car extends Bomb {
	public Car(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		System.out.println("차가 폭발하면서 앞유리창이 깨집니다");
	}
}
