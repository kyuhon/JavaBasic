package kr.co.kh.bomb;

public class House extends Bomb {
	public House(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		System.out.println("집이 무너지면서 불타오릅니다");
	}
}
