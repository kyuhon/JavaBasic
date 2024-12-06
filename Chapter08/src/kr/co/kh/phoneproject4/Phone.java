package kr.co.kh.phoneproject4;

public class Phone extends Object {
	private String name;
	private String phoneNumber;

	public Phone() {
		this(null, null);
	}

	public Phone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "이름 :" + name + ", 핸드폰번호" + phoneNumber;
	}

}
