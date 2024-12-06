package kr.co.kh.min_max;

public class MinMaxMain {

	public static void main(String[] args) {

		double[] data = new double[] {2,5,7,1,9};
		maxArray(data);
		minArray(data);
		
		double max = data[0];
		for(int i=0;i<data.length;i++) {
			if(max < data[i]) {
				max = data[i];
			}
			System.out.print(data[i] + " ");
		}
		System.out.println("\nmax = "+max+"");
		
		double min = data[0];
		for(int i=0;i<data.length;i++) {
			if(min > data[i]) {
				min = data[i];
			}
			System.out.print(data[i] + " ");
		}
		System.out.println("\nmin = "+min+"");
	}

	public static void maxArray(double[] data) {
		double max = data[0];
		for(int i=0;i<data.length;i++) {
			if(max < data[i]) {
				max = data[i];
			}
			System.out.print(data[i] + " ");
		}
		System.out.println("\nmax = "+max+"");
	}
	
	public static void minArray(double[] data) {
		double min = data[0];
		for(int i=0;i<data.length;i++) {
			if(min > data[i]) {
				min = data[i];
			}
			System.out.print(data[i] + " ");
		}
		System.out.println("\nmin = "+min+"");
	
	}
}
