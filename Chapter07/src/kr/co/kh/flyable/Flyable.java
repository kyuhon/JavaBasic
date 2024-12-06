package kr.co.kh.flyable;

public interface Flyable {
	//공동멤버상수, 공동멤버변수(모호성을 발생시킬 수 있다. 메모리는 한개인데)x
	public static final int flyNumber = 0;
	public static final double PI = 3.141592;
	
	abstract public void fly();
	
	//공동멤버함수
	public static void printFlyable() {
		System.out.println("flyNumber="+flyNumber+", PI="+PI+"");
	}
	
}
