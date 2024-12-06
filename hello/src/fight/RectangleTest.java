package fight;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle test = new Rectangle();
		
		test.width = 20.0;
		test.height = 30.0;
		
		System.out.println("Area:" + test.area() + "cm2");
		System.out.println("Perimeter:" + test.perimeter() + "cm");
		
	}

}
