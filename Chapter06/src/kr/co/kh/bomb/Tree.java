package kr.co.kh.bomb;

public class Tree extends Bomb {
	public Tree(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		System.out.println("나무 가지가 떨어지면서 불타오릅니다");
	}
}
