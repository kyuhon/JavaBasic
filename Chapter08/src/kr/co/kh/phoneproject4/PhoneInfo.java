package kr.co.kh.phoneproject4;

public class PhoneInfo extends Phone{
	 private String birthday;
	 
	public PhoneInfo() {
		this(null,null,null);
	}
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		super(name, phoneNumber);
		this.birthday = birthday;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return super.toString() + "생년월일 : " + birthday ;
	}
	 
	
}
