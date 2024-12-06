package kr.co.kh.phoneproject4;

public class PhoneUnivInfo extends Phone {
	 	private String major;
	    private int year;

	    public PhoneUnivInfo(String name, String phNum, String phoneNumber, int year) {
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
			return "PhoneUnivInfo" + super.toString() +","+major+","+ year;
		}

	    
}
