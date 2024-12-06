package kr.co.khedu.car;

public class Car {
	// 멤버변수
	String color;
	int speed;
	int gear;
	// 생성자(디생, 매생)
	public Car() {}
	public Car(String color,int speed,int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
	
	
	// 캡슐화(setter, getter)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	// 연산함수
	public void changeGear(int gear) {
		if(gear <= 0 || gear > 5) {
			System.out.println("정신차려(1단~5단)");
			return;
		}
		this.gear = gear;
	}
	
	public void speedUp() {
		if(this.speed >= 300) {
			System.out.println("300이상 스피드는 안됩니다.");
		}
		speed += 10;
	}
		public void speedDown() {
			if(this.speed < 0) {
				System.out.println("0미만 스피드는 안됩니다.");
				return;
			}
			speed -= 10;
	}
	// 출력함수
	
	public String toString() {
		return "color=" + color + ", speed=" + speed + ", gear=" + gear;
	}
}
