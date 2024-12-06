package kr.co.kh.pizza;

public class Pizzamain {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(10);
		Pizza p2 = new Pizza(20);
		System.out.println("두개의 피자중에 어느것이 크냐");
		Pizza largePizza = Pizza.whosLargest(p1, p2);
		//p1.whosLargest를 클래스 pizza에서 static을 넣어줌으로써
		//Pizza.whosLargest로 바꾸어 공동으로 사용가능
		System.out.println(largePizza.radius);
		
	}

}
