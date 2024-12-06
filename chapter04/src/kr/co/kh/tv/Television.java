package kr.co.kh.tv;

public class Television {
	//멤버변수
	int channelNum;
	int volume;
	boolean isPower;
	
	//생성자(디폴트 생성자, 매개변수 생성자)
	public Television() {} // 디폴트 생성자
	public Television(int channelNum, int volume, boolean isPower) {
		this.channelNum = channelNum;
		this.volume = volume;
		this.isPower = isPower;
	} //매개변수 생성자
	
	//캡슐화(setter, getter)(우측클릭으로 쉽게 생성)
	public int getChannelNum() {
		return channelNum;
	}
	public void setChannelNum(int channelNum) {
		//음수이거나 300번 이상채널이면 등록하지 않음
		if(channelNum < 0 || channelNum > 300) {
			System.out.println("ㄴ");
			return;
		} /*else {
			this.channelNum = channelNum;
		} */
		this.channelNum = channelNum;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return isPower;
	}
	public void setPower(boolean isPower) {
		this.isPower = isPower;
	}
	
	//cal함수,연산함수,get함수
	public String getChannelName() {
		String channelName = null;
		switch (channelNum) {
		case 10:
			channelName = "KBS";
			break;
		case 11:
			channelName = "SBS";
			break;
		case 12:
			channelName = "CBS";
			break;

		default:
			channelName = "없는채널번호입니다.";
			break;
		}
		
		
		return channelName;
	}
	//출력함수(멤버변수 모두 출력하는 기능)
	public String toString() {
		return "Num=" + channelNum + ", volume=" + volume + ", Power="+ isPower;
	}
	
}
