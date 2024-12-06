package kr.co.kh.mymetric;

public class MyMetricTest {

	public static void main(String[] args) {
		MyMetric kmm = new MyMetric();
		
		double x = 10.0;
		double miles = kmm.kiloToMile(x);
		System.out.println(x + "km is " + miles + "miles");
		
		miles = 5.0;
		x = kmm.mileToKilo(miles);
		System.out.println(miles + "miles is " + x + "km");
	}

}
