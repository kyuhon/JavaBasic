package kr.co.kh.singleton;

public class SingleMain {

	public static void main(String[] args) {
		Single single1 = Single.getInstance();
		Single single2 = Single.getInstance();
	
		System.out.println(single1);
		System.out.println(single2);
	
		single1.setAge(27);

		System.out.println(single1);
		System.out.println(single2);
		
	}

}
