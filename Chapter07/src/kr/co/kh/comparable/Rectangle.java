package kr.co.kh.comparable;

public class Rectangle extends Object implements Comparable {
	private int width, height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

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


	//연산메소드
	public int calArea() {
		return width*height;
	}
	@Override
	public int compareTo(Object obj) {
		Rectangle r = null;
		if(!(obj instanceof Rectangle)) {
			System.out.println("부인자타 아닌것이 발생");
			System.exit(1);
		}
		r = (Rectangle)obj;
		return calArea()-r.calArea();
	}
	
	//오버라이딩toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
