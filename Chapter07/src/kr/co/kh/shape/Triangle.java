package kr.co.kh.shape;

public class Triangle extends Shape {

	private int area;
	
	public Triangle(int x, int y) {
		super(x, y);
		area = 0;
		System.out.println("Triangle 생성자 객체생성");
	}

	@Override
	public void draw() {
		area= super.getX()*super.getY() / 2;
		//String data = super.toString();
		System.out.println("Triangle 면적: "+ area + super.toString());
	}

}
