package overlapFor;

public class Basic {

	public static void main(String[] args) {
		
		// 1+(1+2)+(1+2+3)+...+(1+2+3+...+100)을 계산하는 프로그램
		
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			for(int j = 1; j<=i;j++) {
				sum += j;
				
			}
			}
		System.out.println("합은 "+ sum);
	}

}
