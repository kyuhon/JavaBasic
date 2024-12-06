package kr.co.kh.shape;

public class Circle extends Shape {

	public static final double PI = 3.141592;
	private double area;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		area = 0.0;
		this.radius = radius;
		System.out.println("Circle 생성자 객체생성");
	}

	@Override
	public void draw() {
		area = PI * Math.pow(radius, 2);
		String data = String.format("%.2f", area);
		//String data = super.toString();
		System.out.println("Circle 면적: "+data+"" + super.toString());
	}

}
