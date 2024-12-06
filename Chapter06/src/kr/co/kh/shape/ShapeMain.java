package kr.co.kh.shape;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
	//	Shape[] shape = new Shape[2];
	//	shape[0] = new Rectangle(10,10);
	//	shape[1] = new Triangle(20,20);
	
	//	Shape[] shape = new Shape[] {new Rectangle(10,10), new Triangle(20,20)};
		

		ArrayList<Shape> shapeList = new ArrayList<Shape>();	
		
		Rectangle r = new Rectangle(10,10);
		Rectangle t = new Rectangle(20,20);
		shapeList.add(r);
		shapeList.add(t);
		
		for(int i =0;i<shapeList.size();i++) {
			shapeList.get(i).getArea();
		}
	}

}
