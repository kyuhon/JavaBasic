package kr.co.kh.electriccar;

public class ElectricCar {

	private static ElectricCar instance = new ElectricCar();
	private int battery, distance;
	
	private ElectricCar() {
		battery = 100;
		distance = 0;
	}
	//캡슐화
	
	
	public static ElectricCar getInstance() {
		return instance;
	}

	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	//연산함수
	public void dispDistance() {
		System.out.println("주행한 총거리는 "+distance+" km");
	}
	public void dispBattery() {
		System.out.println("배터리 충전량은 "+battery+" %");
	}
	
	public void drive() {
		distance += 1;
		battery -= 10;
		if(battery <= 0) {
			battery = 0;
			System.out.println("더이상 전기차 운행이 안됩니다");
			return;
		}
		System.out.println("운행중");
		
	}
	//출력함수
	@Override
	public String toString() {
		return "ElectricCar [battery=" + battery + ", distance=" + distance + "]";
	}
	
	
}
