package kr.co.kh.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		String[] name = new String[] { "Kim", "Lee", "Ju", "Choi", "Chee", "Bark" };
		List<String> list1 = Arrays.asList(name);
		
		// 1. 배열, 컬렉션 => Stream 변경
		Stream<String> streamList = list1.stream();
		Stream<String> stream = Arrays.stream(name);

		// 2. 스트림을 중간처리 연산(필터기능)
		Stream <String> stream2 = stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String str) {
				char ch = str.charAt(0);
				return ch == 'C';
			}
		});

	// 3. 스트림을 중간처리 연산(정렬필터링)
	Stream <String> stream3 = stream2.sorted(new Comparator<String>() {
		@Override 
		public int compare(String o1,String o2){
			return o1.compareTo(o2);
		}
	});

	// 4. 스트림을 종단처리(배열이나, 컬렉션프레임으로 변경)
	List<String> list2 = stream3.collect(Collectors.toList());
	String[] name2 = list2.toArray(new String[list2.size()]);

	// 5. 결과를 확인
	for(String data : list2) {
		System.out.println(data + "\t");
		}
	System.out.println("===========");
	for(String data : name2) {
		System.out.println(data + "\t");
	}
	}
}


