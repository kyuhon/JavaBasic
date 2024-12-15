package exception;

public class Array {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
        int[] array = new int[10];
        int i = array[10];
        
        //배열의 인덱스는 항상 0부터 배열의 길이 -1까지이므로
        //유효한 인덱스 범위를 초과했기 때문에 예외발생
	}
}
