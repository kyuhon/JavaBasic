package kr.co.kh.desk;

public class Desk {

	double width;
	double height;
	double area;
	boolean fit;
	
	public Desk() {}
	public Desk(double width,double height,double area,boolean fit) {
		this.width = width;
		this.height = height;
		this.area = area;
		this.fit = fit;
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
	public boolean isFit() {
		return fit;
	}
	public void setFit(boolean fit) {
		this.fit = fit;
	}
	
	public boolean isFit(double area) {
		if(area<0.0 || area>200.0) {
			System.out.println("부적합");
			return false;
		}
		return fit;
	}
	
	public String toString() {
		return "width=" + width + ",height" + height + ",area=" + area + " "+ fit;
		
	}
	
}
