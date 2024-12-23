package kr.co.kh.singleton;

public class SingleTon {
	
	private static SingleTon instance;
	public SingleTon() {}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
}
