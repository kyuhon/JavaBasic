package kr.co.kh.remotecontrol;
	//다중상속구현부
public class Tv extends Object implements RemoteControl {
	//멤버변수
	private boolean tvOn;
	//생성자
	public Tv(boolean tvOn) {
		super();
		this.tvOn = tvOn;
	}
	
	//겟터,셋터
	//ToString
	
	
	//연산함수
	@Override
	public void turnOn() {
		tvOn = true;
		System.out.println("Tv 객체에서 TvOn = "+tvOn+"");
	}


	@Override
	public void turnOff() {
		tvOn = false;
		System.out.println("Tv 객체에서 "+ tvOn +"");
	}

}
