package kr.co.kh.base;

public class Drived extends Base {
	private int dNo;

	//부모: 디생 자식: 디생, 매생
	//부모: 매생 자식: 매생
	public Drived(int baseNo, int dNo) {
		super(baseNo);	//부모 디생
		this.dNo = dNo;
		System.out.println("자식생성 dNo ="+dNo+"");
	}

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("자식 print()");
	}
	
	@Override
	public String toString() {
		return "Drived [dNo=" + dNo + "]";
	}
	
	
}
