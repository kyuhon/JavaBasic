package kr.co.kh.box;

public class Asdf {

	public static void main(String[] args) {

		int[][] s = { { 1, 2, 3, 4, 5 }, { 2, 3, 4 } };

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + "  ");
			}
			System.out.println();

		}

	}
}
