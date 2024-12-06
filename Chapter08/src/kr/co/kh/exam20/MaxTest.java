package kr.co.kh.exam20;

public class MaxTest {

	public static void main(String[] args) {
		Integer[] array = {4,12,1,34,5};
		
		int max = array[0];
		int min = array[0];
		
		for(int i =0;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("max = "+max+" , min = "+min+"");
		
		//최대값을 구하는 함수
		int maxValue = calMaxArray(array);
		System.out.println(maxValue);
		//최소값을 구하는 함수
		int minValue = calMinArray(array);
		System.out.println(minValue);
		
	}


	private static int calMaxArray(Integer[] array) {
		int max = array[0];
		for(int i =0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	private static int calMinArray(Integer[] array) {
		int min = array[0];
		for(int i =0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
