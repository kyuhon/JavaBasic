package kr.co.kh.bi_function;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestMain {

	public static void main(String[] args) {
		//BiFunction<T,R,U>  => public U apply(T,R);
		BiFunction<Integer, Integer, Integer> bf = new BiFunction<Integer, Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				
				return Calculator.add(t, u);
			}
		};
		
		int value = bf.apply(10, 20);
		System.out.println("value = " + value);
		//===========================================
		BiFunction<Integer, Integer, Integer> bf2 = (t, u) -> Calculator.add(t, u);
		
		int value2 = bf2.apply(100, 200);
		System.out.println("value2 = " + value2);
		//===========================================
		BiFunction<Integer, Integer, Integer> bf3 = Calculator::add;
													//1급 함수
		int value3 = bf2.apply(1000, 2000);
		System.out.println("value3 = " + value3);
		//============================================
		//Supplier<T> => public T get();
		//1단계
		print(new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				return "내일과 모래는 우리에게 좋은찬스".length();
			}
		});
		//람다식
		print(()-> "내일과 모래는 우리에게 좋은찬스".length());
		//함수식		
		print("내일과 모래는 우리에게 좋은찬스ㄴㄹㄴㅇㄻㄴㅇㄹ"::length);
	}
	public static void print(Supplier<Integer> supplier) {
		System.out.println(supplier.get());
	}
}
