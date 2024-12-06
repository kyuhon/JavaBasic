package kr.co.kh.shape;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
			Rectangle r = new Rectangle(10, 20);
			Shape shape = r;
			shape.draw();
			
			Circle c = new Circle(10, 20, 7);
			Shape shape2 = c;
			shape2.draw();
			
			Triangle t = new Triangle(10, 10);
			Shape shape3 = t;
			shape3.draw();
			
			System.out.println("\n");
			
			ArrayList<Shape> list = new ArrayList<Shape>();
			list.add(new Rectangle(10, 20));
			list.add(new Circle(10, 20, 7));
			for(int i=0;i<list.size();i++) {
				list.get(i).draw();
			}
			
			for(Shape data : list) {
				data.draw(); //동적 바인드
			}
			
	}

}
