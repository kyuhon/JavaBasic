package kr.co.kh.remotecontrol;

public interface RemoteControl {
	//멤버변수없음
	//생성자 없음 -멤버변수 초기값주는거지만 멤버변수가 없어서 쓰지않는다
	//겟터,셋터 없음
	//toString
	//연산자함수(추상메소드) 선언부가 있고, 구현부가 가능
	public void turnOn();
	//abstract는 안에 포함되어있음
	public void turnOff();
	
}
