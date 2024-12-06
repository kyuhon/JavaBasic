package kr.co.kh.shape;

public class Shape extends Object{
	
	//멤버변수
	private int width;
	private int height;
	//디생, 매생
	public Shape() {
		this(0, 0);
	}
	
	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	//겟터, 셋터

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	//toString
	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
	//연산함수
	public void getArea() {
		System.out.println("shape 면적입니다.~~오버라이딩 될것임(동적바인딩)");
	}
	
	
}
