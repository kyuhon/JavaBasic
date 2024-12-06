package kr.co.kh.numberformatexception;

public class NumberFormatExceptionMain {

	public static void main(String[] args) {
		int number = 0;
		
		try {
			number = Integer.parseInt("123K");
		} catch(NumberFormatException e){
			System.out.println("오류");
			number = 100;
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception 발생");
		}finally {
			
		}
		
		System.out.println(number + 1);
		System.out.println("the end");
		
	}

}
