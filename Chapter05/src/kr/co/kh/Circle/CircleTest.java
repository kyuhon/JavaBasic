package kr.co.kh.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj = new Circle(10);
		System.out.println(obj.x+","+obj.y);
		System.out.println("원의 넓이: "+ obj.getArea());
		
	}

}
