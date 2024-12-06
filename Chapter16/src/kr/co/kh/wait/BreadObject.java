package kr.co.kh.wait;

public class BreadObject {
	private String bread;

	public BreadObject() {
		bread = null;
	}
	
	//빵을 만드는 함수
	public synchronized void productBread() {
		 // 빵이 이미 있는 경우, 대기
        while (bread != null) {
            try {
                wait();  // 소비자가 빵을 소비할 때까지 기다림
            } catch (InterruptedException e) {}
        }
        
        // 빵을 만듦
        bread = "단팥빵";
        System.out.println("단팥빵을 만들어서 제공했음");
        
        // 소비자를 깨움
        notify();
	}
	
	
	//빵을 소비하는 함수
	public synchronized void consumerBread() {
		 // 빵이 없는 경우, 대기
        while (bread == null) {
            try {
                wait();  // 생산자가 빵을 제공할 때까지 기다림
            } catch (InterruptedException e) {}
        }
        
        // 빵을 소비
        System.out.println("단팥빵 다 먹었어요 빨리 빵을 제공해주세요");
        bread = null;
        
        // 생산자를 깨움
        notify();
    }
}
