package kr.co.khedu;

public class TestClass {

	public static void main(String[] args) {
		//구의 면적을 구하는 프로그램 작성한다.
		double 면적 = 0.0;
		Sphere sphere = new Sphere(10,"하얀색");
				// 지역변수, 참조변수, 스택영역에 존재함
		sphere.set색깔("빨간색");
		면적 = sphere.구의부피계산하기();
		
		System.out.println("반지름 = "+sphere.get반지름()+"");
		System.out.println("색깔 = "+sphere.get색깔()+"");
		System.out.println("면적 = "+면적+"");
		
		
		
	}

}
