package kr.co.kh.tv;

public class TvMain {

	
	
	public static void main(String[] args) {
		// 디폴트 tv객체를 만든다
		Television tv = new Television();
		// String rValue = tv.toString();
		System.out.println(tv.toString());
		
		tv.setChannelNum(-3);
		
		
		// String channelName = tv.getChannelName();
		System.out.println(tv.getChannelName());
		
		//매생 tv객체를 만든다
		Television tv2 = new Television(12,10,true);
		System.out.println(tv2.toString());
		System.out.println(tv2.getChannelName());
	}

}
