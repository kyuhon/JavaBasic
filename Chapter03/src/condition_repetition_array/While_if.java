package condition_repetition_array;

public class While_if {

	public static void main(String[] args) {
			
			int a = 2;
			int b = 2;
			int c = 2;

			while (a <= 9) {
				if (a % 2 != 0) {
					a++;
					continue;
				}
				a++;
				System.out.println("a:" + a);
			}
			
			System.out.println();
			
			while (b <= 9) {
				if (b % 2 != 0) {
					continue;
				}
				System.out.println("b:" + b);
				b++;
			}
			
			//두번째 while문에서 무한루프가 이뤄지기 때문에 세번째 while문이 실행되지 않는다
			
			System.out.println();
			
			while (c <= 9) {
				if (c % 2 != 0) {
					c++;
					continue;
				}
				System.out.println("c:" + c);
				c++;
			}
	}

}
