package kr.co.kh.bomb;

public class Building extends Bomb {

	public Building(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		System.out.println("빌딩이 무너지면서 불타오릅니다");
	}
	
	
}
