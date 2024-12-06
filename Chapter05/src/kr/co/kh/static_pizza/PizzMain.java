package kr.co.kh.static_pizza;

public class PizzMain {

	public static void main(String[] args) {
		//Pizza 객체를 만들지 않고도 공동멤버변수(정적멤버변수), 공동멤버함수(정적멤버함수) 사용할수 있다.
		//공동멤버변수와 공동멤버함수는 우리끼리 사용하는용어, 나중에 정적이라는 말이 또 사용되기에
		System.out.println(Pizza.PI);
		System.out.println(Pizza.count);
		Pizza.sprintMember();
		//Pizza 인스턴스멤버, 인스턴스멤버함수 사용할려면, new
		Pizza pizza = new Pizza("치즈", 10);
		System.out.println(pizza.getTopping());
		System.out.println(pizza.getRadius());
		pizza.setRadius(20);
		System.out.println(pizza);
		
		Pizza pizza1 = new Pizza("치즈", 5);
		Pizza pizza2 = new Pizza("치즈2", 15);
		Pizza pizza3 = new Pizza("치즈3", 25);
		Pizza pizza4 = new Pizza("치즈4", 35);
		Pizza pizza5 = new Pizza("치즈5", 45);
		
		System.out.println(Pizza.count);
	}

}
