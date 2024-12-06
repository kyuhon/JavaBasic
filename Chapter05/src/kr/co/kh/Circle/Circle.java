package kr.co.kh.Circle;

public class Circle extends Shape {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		x = 0;
		y = 0;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	
}
