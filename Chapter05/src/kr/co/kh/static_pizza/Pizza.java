package kr.co.kh.static_pizza;

public class Pizza {
	//멤버변수(인스턴스멤버,공멤=상수)
	private String topping;
	private int radius;
	public static final double PI=3.141592;
	public static int count=0;
	//생성자(인스턴스 멤버 매개변수 생성자,공멤블럭)
	public Pizza(String topping, int radius) {
		super();
		this.topping = topping;
		this.radius = radius;
		Pizza.count++;
	//캡슐화(setter,getter)
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//출력함수(멤버변수모두출력하는기능)
	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", radius=" + radius + "]";
	}
	
	//연산함수(인멤연산,공멤연산)
	public void printMember() {
		System.out.println(topping);
		System.out.println(radius);
		System.out.println(Pizza.count);
		System.out.println(Pizza.PI);
		Pizza.sprintMember();
	}
	public static void sprintMember() {
		//System.out.println(topping);
		//System.out.println(radius);
		System.out.println(Pizza.count);
		System.out.println(Pizza.PI);
		//printMember();
	}
}
