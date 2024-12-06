package kr.co.kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		//1. 구현클래스
		MyApply ma = new MyApply();
		Double value = ma.apply((Integer)10);
		System.out.println("value = " +value+"");
		
		//2. 임시객체(구현클래스가 없음)
		MyFunction<Integer, Double> mf = new MyFunction<Integer, Double>();{
			
			@Override
			public Double apply(Integer t) {
				return t + 4.0;
				
			}
		};
		
		Double value2 = mf.apply((Integer)10);
		System.out.println("value2 = " +value2+"");
		
		// 3. 람다식
		MyFunction<Integer, Double mf2 = (Integer t) -> t + 5.0;
		Double value3 = mf2.apply((Integer)10);
		System.out.println("value3 =" + value3 + "");
	
	// 인터페이스를 만들지 않고 사용할수 있다. => 범용용으로 이미 만들어냈다. (인터페이스를 9개)
	
	//1.임시객체
		Function<Integer, String> fun = new Function<Integer, String>() {
			
			@Override
			public String apply(Integer t) {
				return t + " 값입니다.";
			}
		};
		
		//2. 람다식
	}

}
