package kr.co.kh.remotecontrol;
	//다중상속구현부
public class Computer extends Object implements RemoteControl {
	//멤버변수
	private boolean compOn;
	//생성자
	public Computer(boolean compOn) {
		super();
		this.compOn = compOn;
	}
	
	//겟터,셋터
	//ToString
	
	
	//연산함수
	@Override
	public void turnOn() {
		compOn = true;
		System.out.println("Computer 객체에서 compOn = "+compOn+"");
	}




	@Override
	public void turnOff() {
		compOn = false;
		System.out.println("Computer 객체에서 "+ compOn +"");
	}

}
