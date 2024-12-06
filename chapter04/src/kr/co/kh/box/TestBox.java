package kr.co.kh.box;

public class TestBox {

	public static void main(String[] args) {

		Box box = new Box();
		box.set가로(10);
		box.set세로(10);
		box.set높이(10);
		
		System.out.println("width*height*length = volume");
		System.out.println(box.상자의부피());
	}

}
