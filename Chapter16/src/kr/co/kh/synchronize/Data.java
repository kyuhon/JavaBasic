package kr.co.kh.synchronize;

public class Data {
	private int memory;

	public Data() {
	}

	public Data(int memory) {
		super();
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += 1;
		}

		this.memory = memory;
		// 2초간 정지(데드락을 억지로 만드는것)
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
			// memory 가지고 2초동안 계산처리를 한다고 생각할것
			// context switching 발생이됨
		} catch (InterruptedException e) {
		}
		// 연산결과값을 출력한다
	}

	@Override
	public String toString() {
		return "Data [memory=" + memory + "]";
	}

}
