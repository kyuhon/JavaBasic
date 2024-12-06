package src.kr.co.khedu.phone_project4step_set;

import java.util.Objects;

public class PhoneInfo extends Phone implements Comparable<PhoneInfo>{
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
		
		return "PhoneInfo "+super.toString()+","+ birthday + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(super.getPhoneNumber());
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof PhoneInfo)) {
			return false;
		}
		PhoneInfo pi = (PhoneInfo)obj;
		return (this.getPhoneNumber().equals(pi.getPhoneNumber()));
	}
    
	@Override
	public int compareTo(PhoneInfo o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
		
	}
}
