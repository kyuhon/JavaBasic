package src.kr.co.khedu.phone_project4step;

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
		
		return "PhoneInfo "+super.toString()+","+ birthday + "]";
	}
    
	
    

    


}
