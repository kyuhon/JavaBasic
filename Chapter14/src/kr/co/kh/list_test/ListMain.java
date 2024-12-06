package kr.co.kh.list_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.stream.Stream;

public class ListMain {

	public static void main(String[] args) {
			Integer[] intArray = new Integer[] {12,3,34,27,56,14};
		
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			
			list = Arrays.asList(intArray);
			
			//list1 에 있는 데이터를 필터링해서(2의배수) 새로운 list2 만들어서 저장하고, 출력한다.
			for(Integer data : list) {
				if(data%2 ==0) {
					list2.add(data);
				}
			}
			for(Integer data : list2) {
			//	System.out.print(data+"\t");
			}
			
			//stream 방식(향상된 for문을 생각해라)
			
			//Stream <Integer> stream = list.stream();
			
			//Predicate - 인터페이스로 임시객체
			
			//1단계 (11문장 +1) => 12문장
			MYaccept myAccept = new MYaccept();
			list.stream().filter(data -> data%2 == 0).forEach(myAccept);
				
			
			//2단계(임시객체)
			Consumer<Integer> consumer = new Consumer<Integer>() {
				
				@Override
				public void accept(Integer data) {
					System.out.println(data);
				}
			};
			list.stream().filter(data -> data%2 == 0).forEach(consumer);
			
			//3단계(매개변수안에서 작성 : 임시객체)
			list.stream().filter(data -> data%2 == 0).forEach(new Consumer<Integer>(){
				@Override
				public void accept(Integer data) {
					System.out.println(data);
				}
			});
			
			//4단계(람다식)
			list.stream().filter(data -> data%2 == 0).forEach(data -> System.out.println(data+"\t"));
			//5단계(함수선언식)
			list.stream().filter(data -> data%2 == 0).forEach(System.out::println);
		
	}

}
