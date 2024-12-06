package hello;

public class Test {

	public static void main(String[] args) {
		
		// 100이하의 소수
		
		int remain = 0;
		int count = 0;
		for(int data=2;data<=100;data++) {
			for(int i=2; i<=data-1; i++) {
				remain = data % i;
				if(remain==0) {
					break;
				}else {
					count++;
				}
			} //end of for
			if(count==data-2) {
				System.out.println(data+" ");
			}
			//초기화
			remain = 0;
			count = 0;
		}//end of for
		
		
	}

}
