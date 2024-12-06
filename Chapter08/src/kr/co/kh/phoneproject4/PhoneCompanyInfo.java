package kr.co.kh.phoneproject4;

public class PhoneCompanyInfo extends Phone {
	private String company;

	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "PhoneCompanyInfo " + super.toString() + "," + company;
	}

	/*
	 * @Override public void printAll() { System.out.println("이름 : "+getName());
	 * System.out.println("전화번호 : "+getPhoneNumber());
	 * System.out.println("회사 : "+company); }
	 */

}
