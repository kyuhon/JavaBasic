package kr.co.kh.shape;

public class Triangle extends Shape {

	public Triangle(int width, int height) {
		super(width, height);
	}
	//겟터, 셋터 부모를 그대로 사용한다
	//연산함수(부모것이 마음에 안들어 => 오버라이딩)

	@Override // 작성하지 않으면 오버로딩될 수도 있다
	public void getArea() {
		double area = this.getWidth()*this.getHeight() / 2.0; //2는 상수설정을 할 필요가없지만 값이 조금씩 바뀌고있는 파이같은 경우는 상수로 바꾸어야한다
		System.out.println("Triangle 면적: "+area+"");
		return;
	}
	//상수가 만들어진 원인으로는 가독성과 디버깅 때문이다
}
