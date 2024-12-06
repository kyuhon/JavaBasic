package kr.co.kh.lamp;

public class DeskLamp {

		private boolean isOn;
		
		public void turnOn() {isOn = true;}
		public void turnOff() {isOn = false;}
		
		public String x() {
			
		return "현재 상태는" + (isOn==true?"켜짐":"꺼짐");
			
		}
		
		public DeskLamp() {
			
		}
		
}
