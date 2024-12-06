package kr.co.kh.rectangle;

public class Rectangle {
	
	double width;
	double height;
	double area;
	double perimeter;
	
	public Rectangle() {}
	public Rectangle(double width, double height, double area, double perimeter) {
		this.width = width;
		this.height = height;
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double areaCalculate() {
		double area = width*height;
		return area;
	}
	
	public double perimeterCalculate() {
		double perimeter = (width+height)*2;
		return perimeter;
	}
}
