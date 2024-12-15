package condition_repetition_array;

public class While_if2 {

	public static void main(String[] args) {
		int i = 0, sum = 0;
		while(i < 10 )
		{
			sum += i++;
			if( i % 3 == 0 ) continue;
			System.out.println("i="+i);
			if( sum > 10 ) break;
		}
		
		int sum2 = 0;
		for (int x = 1; x<= 10; x++)
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
	}

}
