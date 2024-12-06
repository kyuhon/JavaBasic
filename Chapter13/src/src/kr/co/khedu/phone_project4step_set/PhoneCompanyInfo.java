package src.kr.co.khedu.phone_project4step_set;

import java.util.Objects;

public class PhoneCompanyInfo extends Phone implements Comparable<PhoneCompanyInfo> {
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
		return "PhoneCompanyInfo "+super.toString()+","+ company + "]";
	}
    
	@Override
	public int hashCode() {
		return Objects.hashCode(super.getPhoneNumber());
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof PhoneCompanyInfo )) {
			return false;
		}
		PhoneCompanyInfo  pi = (PhoneCompanyInfo )obj;
		return (this.getPhoneNumber().equals(pi.getPhoneNumber()));
	}
    
	@Override
	public int compareTo(PhoneCompanyInfo o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
		
	}
}
