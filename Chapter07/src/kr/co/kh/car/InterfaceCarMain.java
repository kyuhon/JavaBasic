package kr.co.kh.car;

import java.util.ArrayList;

public class InterfaceCarMain {

	public static void main(String[] args) {
		
		ArrayList<InterfaceCar> list = new ArrayList<InterfaceCar>();
		
		list.add(new AutoCar());
		list.add(new AiCar());
		
		for(InterfaceCar data : list) {
			data.start();
			int speed = data.setSpeed(200);
			data.turn(30);
			data.stop();
		}
		
		
		
		
	}

}
