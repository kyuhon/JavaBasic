package src.kr.co.khedu.phone_project4step;

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
		return "PhoneCompanyInfo "+super.toString()+","+ company + "]";
	}
    
    
}
