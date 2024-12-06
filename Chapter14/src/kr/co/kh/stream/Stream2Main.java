package kr.co.kh.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2Main {

	public static void main(String[] args) {
		String[] name = new String[] { "Kim", "Lee", "Ju", "Choi", "Chee", "Bark" };
		
		// 1. 배열, 컬렉션 => Stream 변경
		//Stream<String> stream = Arrays.stream(name);

		// 2. 스트림을 중간처리 연산(필터기능)
		//Stream <String> stream2 = Arrays.stream(name).filter(str -> str.startsWith("C"));

		// 3. 스트림을 중간처리 연산(정렬필터링)
		//Stream <String> stream3 = Arrays.stream(name).filter(str -> str.startsWith("C"))
		//		.sorted((o1,o2) -> o1.compareTo(o2));

		// 4. 스트림을 종단처리(배열이나, 컬렉션프레임으로 변경)
		List<String> list2 = Arrays.stream(name).filter(str -> str.startsWith("C"))
				.sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());

	// 5. 결과를 확인
	for(String data : list2) {
		System.out.println(data + "\t");
		}
	}

}
