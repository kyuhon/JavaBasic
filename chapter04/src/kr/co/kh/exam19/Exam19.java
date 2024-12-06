package kr.co.kh.exam19;
//1과 100사이의 정수 10개를 읽어야하고
//1~10, 11~20 등의 범위에 드는 값들의 횟수를
//출력하여야 한다
public class Exam19 {

	public static void main(String[] args) {
		int[] count = new int[10];
		//count[0] 1~10, count[1] 11~20
		for(int i=0;i<10;i++) {
			int number = (int)(Math.random()*(100-1+1)+1);
			count[number/10]++;
			System.out.print(number+" ");
		}
		
		System.out.println();
		for(int i =0;i<10;i++) {
			System.out.print(""+(i*10+1)+" ~ "+(i+1)*10+" : ");
		for(int j =0;j<count[i];j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
