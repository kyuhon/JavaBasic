package kr.co.kh.thread_state;

public class TraceStateThread extends Thread {
	private TargetThread tt;

	public TraceStateThread(TargetThread tt) {
		setName("감시스레드");
		this.tt = tt;
	}

	@Override
	public void run() {
		while (true) {
			// 상태점검(상대방스레드 상태를 점검)
			State state = tt.getState();
			System.out.println("tt현재상태는" + state.toString());

			if (state == Thread.State.NEW) {
				tt.start();
			} else if (state == Thread.State.TERMINATED) {
				System.out.println("상태를 점검할 스레드가 종료되었습니다");
				break;
			}
			
			//시간지연
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}//end of while
		System.out.println(getName() + "the end");
	}

}
