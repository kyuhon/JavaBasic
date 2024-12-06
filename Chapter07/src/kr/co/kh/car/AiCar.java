package kr.co.kh.car;

public class AiCar implements InterfaceCar {
	
	private int speed, degree;

	public AiCar(int speed, int degree) {
		super();
		this.speed = speed;
		this.degree = degree;
	}
	
	
	public AiCar() {
		super();
	}


	public int getDegree() {
		return degree;
	}



	public void setDegree(int degree) {
		this.degree = degree;
	}



	public int getSpeed() {
		return speed;
	}

	


	@Override
	public void start() {
		System.out.println("AI자동차가 출발합니다");
		return;
	}

	@Override
	public void stop() {
		System.out.println("AI자동차가 정지합니다");
	}

	@Override
	public int setSpeed(int speed) {
		this.speed = speed;
		System.out.println("AI자동차가"+speed+" 속도로 달립니다");
		return speed;
	}

	@Override
	public int turn(int degree) {
		this.degree = degree;
		System.out.println("AI자동차가"+degree+" 속도로 달립니다");
		return degree;
	}
	
}
