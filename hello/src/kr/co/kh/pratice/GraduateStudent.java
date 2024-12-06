package kr.co.kh.pratice;

public class GraduateStudent extends Student {

		public String lab;

		
		
		public GraduateStudent(String lab) {
			super();
			this.lab = lab;
		}

		public GraduateStudent() {
			super();
		}

		public GraduateStudent(int number, String name) {
			super(number, name);
		}

		public String getLab() {
			return lab;
		}

		public void setLab(String lab) {
			this.lab = lab;
		}
		
		
		
		
		
}
