package kr.co.kh.priority;

public class Thread2Main {

	public static void main(String[] args) {
		//스레드를 10개를 만들고 돌린다
		
		
		for(int i=1;i<=10;i++) {
		Thread t = new ThreadB("스레드"+i);
		//우선순위권한설정
		if(i != 10) {
			t.setPriority(Thread.MIN_PRIORITY);
		}else {
			t.setPriority(Thread.MAX_PRIORITY);
			
		}
		
		t.start();
		}
		//우선순위가 제대로 설정되지 않는 이유는 
		//운영체제의 스레드 스케줄러가 자바 스레드 우선순위를 반드시 따르지 않기 때문일 수 있습니다.
	}

}
