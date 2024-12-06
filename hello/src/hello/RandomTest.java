package hello;


public class RandomTest {

	public static void main(String[] args) {
		//랜덤값 추출 1~10추출한다.
		//Math.random(): 0.0 <= 결과값 && 결과값 < 1.0
		// double data = Math.random();
		// System.out.println(data);
		
		//랜덤값 추출 50~67추출한다.
		//Math.random(): 0.0 <= 결과값 && 결과값 < 1.0
		// double data = Math.random()(큰값-작은값+1)+작은값;
		// System.out.println(data);
		
		//반복문
		for(int i=1; i<=10; i++) {
			double data2 = Math.random();
			System.out.println(""+i+" = "+data2+"");
			
	
		}
	}

}
