package kr.co.kh.priority;

public class ThreadB extends Thread {
	
	public ThreadB(String name) {
		setName(name);
	}

	@Override
	public void run() {
		//시간check방법
		long start = System.currentTimeMillis();//현재시간을 1/1000초로 값을 출력
		for(int i =0;i<=200000000;i++) {
			//약 20억번을 실행한다.
		}
		long stop = System.currentTimeMillis();//현재시간을 1/1000초로 값을 출력
		System.out.println(getName() + "("+((stop - start)/1000.0)+")");
	}

}
