package src.kr.co.khedu.phone_project4step_map;

import java.util.Objects;

public class PhoneUnivInfo extends Phone implements Comparable<PhoneUnivInfo> {
	private String major;
	private int year;

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "PhoneUnivInfo "+super.toString() +","+major + "," + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(super.getPhoneNumber());
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof PhoneUnivInfo )) {
			return false;
		}
		PhoneUnivInfo  pi = (PhoneUnivInfo )obj;
		return (this.getPhoneNumber().equals(pi.getPhoneNumber()));
	}
    
	@Override
	public int compareTo(PhoneUnivInfo o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
		
	}

}
