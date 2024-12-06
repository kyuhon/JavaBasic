package kr.co.khedu;
//sphere : 구체
public class Sphere {
	//변수(9가지)
	int 반지름; 
	String 색깔;
	static final double PI = 3.141592;
	
	//매개변수 생성자함수
	public Sphere(int 반지름, String 색깔) {
		this.반지름 = 반지름; //초기값
		this.색깔 = 색깔;
	}
	public Sphere(int 반지름) {
		this.반지름 = 반지름; //초기값
	}
	//디폴트 생성자함수
	public Sphere() {
	}
	//함수(멤버변수를 값을 주고, 값을 요청하는 기능)
	
	public void set반지름(int 반지름) {
		this.반지름 = 반지름;
	}
	//멤버변수를 직접 사용할 수 없어서 만드는 함수
	public int get반지름() {
		return this.반지름;
	}
	
	public void set색깔(String 색깔) {
		this.색깔 = 색깔;
	}
	public String get색깔() {
		return this.색깔;
	}
	//함수(일=동작=기능)
	//보고서변수(9가지) 동작이름(입력값변수:9가지){일의 내용}
	public double 구의부피계산하기() {
		//구의부피계산식
		double volume = (4.0/3.0)*Sphere.PI*Math.pow(반지름, 3.0);//반지름*반지름*반지름;
		//결과값리턴
		return volume;
	}
}
