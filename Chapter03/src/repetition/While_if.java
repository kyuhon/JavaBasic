package repetition;

public class While_if {

	public static void main(String[] args) {

		System.out.println("1번");
		int i = 0, sum = 0;
		while (i < 10) {
			sum += i++;
			if (i % 3 == 0)
				continue;
			System.out.println("i=" + i);
			if (sum > 10)
				break;
		}

		int sum2 = 0;
		for (int x = 1; x <= 10; x++)
			sum += x;
		System.out.printf("1부터 10까지의 정수의 합 = %d\n", sum2);

//				sum = 0, i = 0
//				1 % 3 = 1 , false
//				i=1
//				sum = 0 , false
//
//				sum = 0 + 1 = 1 , i = 1
//				2 % 3 = 2 , false
//				i=2
//				sum = 1 , false
//
//				sum = 1 + 2 = 3, i = 2
//				3 % 3 = 0 , true
//
//				sum = 3 + 3 = 6, i = 3
//				4 % 3 = 1, false
//				i=4
//				sum = 6 , false
//
//				sum = 6 + 4 = 10 , i = 4
//				5 % 3 = 2, false
//				i = 5
//				sum = 10, false
//
//				sum = 10 + 5 = 15, i = 5
//				6 % 3 = 0 , true
//
//				sum = 15 + 6 = 21, i =6
//				7 % 3 = 1, false
//				i = 7
//				sum = 21, true

		System.out.println();

		System.out.println("2번");
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

		// 두번째 while문에서 무한루프가 이뤄지기 때문에 세번째 while문이 실행되지 않는다
		// 두번째 while문이 반복실행 되고 있으나 코딩에 의해서
		// 내부적으로만 반복되고 콘솔창에는 반복실행이 보이지 않음

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
