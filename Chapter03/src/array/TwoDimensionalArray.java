package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//2차원 배열
		
		System.out.println("1번 문제");
		int[][] seats = { { 0, 0, 1, 1, 0 }, 
						  { 0, 1, 0, 1, 0 }, 
						  { 1, 1, 0, 1, 0 }, 
						  { 1, 1, 0, 0, 0 } };
		int count = 0;

		for (int i = 0; i < seats.length; i++) {
			for (int k = 0; k < seats[i].length; k++) {
				count += seats[i][k];
			}
		}
		System.out.println("현재 관객 수는 " + count + "명입니다");
		System.out.println();
		
		
		
		System.out.println("2번 문제");
		int[][] array = new int[4][5];
		int count2 = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * (2));
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					count2++;
				}
			}
		}
		System.out.println("1의 개수는 " + count2 + "");
		System.out.println();
		
		
		

		
	}
}
