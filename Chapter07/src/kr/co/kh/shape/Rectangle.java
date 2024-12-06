package kr.co.kh.shape;

public class Rectangle extends Shape {

	private int area;
	
	public Rectangle(int x, int y) {
		super(x, y);
		area = 0;
		System.out.println("Rectangle 생성자 객체생성");
	}

	@Override
	public void draw() {
		area= super.getX()*super.getY();
		//String data = super.toString();
		System.out.println("Rectangle 면적: "+ area + super.toString()+"r=radius");
	}

}
