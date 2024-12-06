package kr.co.kh.car;

public class ElectricCar extends Car {
	private int battery;

	public ElectricCar(int speed, int battery) {
		super(speed);
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "ElectricCar [battery=" + battery + "]";
	}
	
	
}
