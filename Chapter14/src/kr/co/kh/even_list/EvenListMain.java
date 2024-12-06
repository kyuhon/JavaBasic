package kr.co.kh.even_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenListMain {
	
	public static void main(String[] args) {
	Integer[] intArray = new Integer[] {1,2,3,4,5,6,7,8};
	
	//1. 배열을 스트림으로 변환 (레코드 = 테이블 전체)
	Stream<Integer> stream = Arrays.stream(intArray);
	
	//2. 짝수를 구한다 (where -> filter)
	Stream <Integer> stream2 = stream.filter(t -> t%2 == 0);
	
	//3. 제곱승 Map (select (number*number) from student where (number%2 == 0)
	Stream <Integer> stream3 = stream2.map(t -> t*t);
	
	//4. list 변형
	List <Integer> list2 = stream3.collect(Collectors.toList());
	
	// List<Integer> list2 = Arrays.stream(intArray).filter(t - t%2 == 0).map(t -> t*t).collect(Collectors.toList());
	
	System.out.println(list2.toString());
	}
}
