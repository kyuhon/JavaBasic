package kr.co.kh.mymetric;

public class MyMetric {

	double km;

	public MyMetric() {
	}
	public MyMetric(double km) {
		super();
		this.km = km;
	}
	
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "MyMetric [km=" + km + "]";
	}
	
	public static double kiloToMile(double km) {
        return km * 0.62;
	}
	
	 public static double mileToKilo(double mile) {
	        return mile / 0.62;
	 }
       
}
