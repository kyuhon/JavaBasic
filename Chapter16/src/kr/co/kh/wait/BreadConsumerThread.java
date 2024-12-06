package kr.co.kh.wait;

public class BreadConsumerThread extends Thread {
	private BreadObject bo;
	
	public BreadConsumerThread(BreadObject bo) {
		super();
		this.bo = bo;
	}
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			bo.consumerBread();
		}
	}
}
