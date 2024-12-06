package kr.co.kh.car;

public interface InterfaceCar {
	//공동멤버상수
	//멤버안됨, 생성자안됨, 겟터 셋터 안됨
	//추상메소드, 공동멤버함수
	public abstract void start();
	public abstract void stop();
	public abstract int setSpeed(int speed);
	public abstract int turn(int degree);
	
}
