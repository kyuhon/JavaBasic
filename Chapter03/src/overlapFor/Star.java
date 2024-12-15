package overlapFor;

public class Star {

	public static void main(String[] args) {

		// 중첩반복문을 사용하여 콘솔창에 별모양 만들기

		
		System.out.println("--1--");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("--2--");
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		
		System.out.println("--3--");
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		
		System.out.println("--4--");
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("--5--");
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (4 - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("--6--");
		for (int i = 0; i < 7; i++) {
			if (i < 4) {

				for (int j = 0; j < 3 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < i - 3; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * (6 - i) + 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		
		System.out.println("--7--");
		for (int i = 0; i < 11; i++) {
			if (i < 6) {
				for (int j = 0; j < 6 - i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 6 - i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - 4; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 11 - (2 * (i - 5)); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i - 4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		System.out.println("--8--");
		for (int i = 0; i < 9; i++) {
			if (i < 5) {

				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		System.out.println("--9--");
		for (int i = 0; i < 9; i++) {
			if (i < 5) {

				for (int j = 0; j < 4 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < i - 4; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 9 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		System.out.println("--10--");
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 9 - (2 * i); j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j < 8 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * i) - 7; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 8 - i; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
		System.out.println("--11--");
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 8 - (2 * i); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < 8 - i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < (2 * i) - 8; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 8 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
