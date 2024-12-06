package kr.co.kh.wait;

public class BreadProductThread extends Thread {
	private BreadObject bo;
	
	public BreadProductThread(BreadObject bo) {
		super();
		this.bo = bo;
	}
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			bo.productBread();
		}
	}
}
