package kr.co.kh.pizza;

public class Pizza {
	//멤버변수
	int radius;
	//생성자
	public Pizza(int radius) {
		this.radius = radius;
	}
	
	//캡슐화(setter, getter)
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//출력함수
	@Override
	public String toString() {
		return "Pizza [radius=" + radius + "]";
	}
	//연산멤버함수 피자 객체2개를받아서더큰피자객체를반환하는메소드Pizza 
	// whosLargest(Pizza p1, Pizza p2)를 작성하고 테스트하라.
	public static Pizza whosLargest(Pizza p1, Pizza p2) {
		if(p1.getRadius() > p2.getRadius()) {
			return p1;
		}else {
			return p2;
		}
	}
}
//주소, 객체참조변수로는 크기비교가 안된다