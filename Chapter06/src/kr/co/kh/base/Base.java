package kr.co.kh.base;

public class Base extends Object{
	//Object는 디폴트생성자밖에 없음
	private int baseNo;
	
	public Base(int baseNo) {
		this.baseNo = baseNo;
		System.out.println("부모생성 baseNo ="+baseNo+"");
	}

	public int getBaseNo() {
		return baseNo;
	}

	public void setBaseNo(int baseNo) {
		this.baseNo = baseNo;
	}
	
	public void print() {
		System.out.println("부모 print()");
	}
	
	@Override
	public String toString() {
		return "Base [baseNo=" + baseNo + "]";
	}
	
	
	
}
