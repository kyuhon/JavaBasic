package kr.co.kh.shape;

public class Rectangle extends Shape {

	//멤버변수 (width, height 필요한데 Shape 존재하기 때문에 상속받는다)
	//생성자
	public Rectangle(int width, int height) {
		super(width, height);
	}
	//겟터, 셋터 부모를 그대로 사용한다
	//연산함수(부모것이 마음에 안들어 => 오버라이딩)

	@Override // 작성하지 않으면 오버로딩될 수도 있다
	public void getArea() {
		int area = this.getWidth()*this.getHeight();
		System.out.println("Rectangle 면적: "+area+"");
		return;
	}
	
	
}
