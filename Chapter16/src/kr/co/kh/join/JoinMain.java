package kr.co.kh.join;

public class JoinMain {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		SumThread t = new SumThread(mainThread);
		t.start();
		try {
			t.join();
			System.out.println("sumThread 끝났어요");
		} catch (InterruptedException e) {}
		System.out.println("합계" + t.getSum());
	}

}
