package kr.co.kh.card;

import java.util.Arrays;

public class Card {
	public String[] type;
	public String[] num;
	public Card() {
		super();
		type = new String[] {"클로버","다이아몬드","하트","스페이드"};
		num = new String[] {"에이스","2","3","4","5","6","7","8","9","10","잭","퀸","킹"};
	}
	public String[] getType() {
		return type;
	}
	public void setType(String[] type) {
		this.type = type;
	}
	public String[] getNum() {
		return num;
	}
	public void setNum(String[] num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Card [type=" + Arrays.toString(type) + ", num=" + Arrays.toString(num) + "]";
	}
	
	
}
