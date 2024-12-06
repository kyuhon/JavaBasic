package kr.co.kh.remotecontrol;

import java.util.ArrayList;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl rm = new Tv(false);
		//Tv tv = new Tv(false);
		//RemoteControl rm = tv; // 부 = 자
		rm.turnOn(); //부.추상메소드 -> 자식의 turnOn이 작동
		rm.turnOff();
		
		RemoteControl rm2 = new Computer(false);
		rm2.turnOn();
		rm2.turnOff();
		
		ArrayList<RemoteControl> list = new ArrayList<RemoteControl>();
		
		list.add(new Tv(false));
		list.add(new Computer(false));
		
		for(RemoteControl data : list) {
			data.turnOff();
			data.turnOn();
		}
		
	/*	Tv tv2 = null;
		
		if(rm instanceof Tv ){
			tv2 = (Tv)rm;
			tv2.turnOff();
		}
	*/
	}

}
