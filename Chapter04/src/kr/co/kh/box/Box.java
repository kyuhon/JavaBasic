package kr.co.kh.box;

public class Box {

	int 가로;
	int 세로;
	int 높이;
	
	public Box(int 가로, int 세로, int 높이) {
		this.가로 = 가로;
		this.세로 = 세로;
		this.높이 = 높이;
	}
	
	public Box() {

	}
	
	public void set가로(int 가로) {
		this.가로 = 가로;
	}
	public int get가로() {
		return this.가로;
	}
	public void set세로(int 세로) {
		this.세로 = 세로;
	}
	public int get세로() {
		return this.세로;
	}
	public void set높이(int 높이) {
		this.높이 = 높이;
	}
	public int get높이() {
		return this.높이;
	}
		
	public double 상자의부피() {
		double volume = 가로 * 세로 * 높이;
		return volume;
	}
	
		
	}
	

