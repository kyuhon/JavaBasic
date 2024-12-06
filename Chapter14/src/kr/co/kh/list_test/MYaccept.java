package kr.co.kh.list_test;

import java.util.function.Consumer;

public class MYaccept extends Object implements Consumer<Integer> {
	
	public MYaccept() {
		super();
	}

	@Override
	public void accept(Integer data) {
		//여기있는 내용은 자주 변할수 있는 영역
		System.out.println(data+"번");
	}
	// Integer - 인터페이스, 안에 추상메소드 구현되어있음
}
