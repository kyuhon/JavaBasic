package kr.co.kh.wait;

public class WaitMain {

	public static void main(String[] args) {
		BreadObject bo = new BreadObject();
		
		BreadConsumerThread bct = new BreadConsumerThread(bo);
		BreadProductThread bpt = new BreadProductThread(bo);
		bct.start();
		bpt.start();
	}

}
