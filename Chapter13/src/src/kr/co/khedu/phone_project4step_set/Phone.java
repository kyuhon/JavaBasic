package src.kr.co.khedu.phone_project4step_set;

public class Phone extends Object {
	private String name;
    private String phoneNumber;  //pk(primary key,null x)=uk(uniqe key,null 딱 한번만 허용) 멤버변수
    
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
		return "[" + name + ", " + phoneNumber ;
	}
}
