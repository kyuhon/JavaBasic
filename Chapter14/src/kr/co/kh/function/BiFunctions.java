package kr.co.kh.function;

import java.util.function.BiFunction;

public class BiFunctions {

	public static void main(String[] args) {
		
		//BiFunction<T,U,R> => public R apply(T,U);
		BiFunction<String, String, Integer> bf = new BiFunction<String, String, Integer>(){
			
			@Override
			public Integer apply(String t, String u) {
				return t.length() + u.length();
			}
		};
		
		int time = bf.apply("와 내일 공부하는날", "와 모래 공부하는날");
		System.out.println("우리가 공부해야될 시간은" + time);
		
		//람다식
		BiFunction<String, String, Integer> bf2 = (t,u)->t.length() + u.length();
			
		
		int time2 = bf.apply("와 내일 공부하는날", "와 모래 공부하는날");
		System.out.println("우리가 공부해야될 시간은" + time2);
		
	}

}
