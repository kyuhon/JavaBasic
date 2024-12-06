package kr.co.kh.car;

public class MyCarPredicate implements CarPredicate {
	
	@Override
	public boolean test(Car data) {
		return data.getColor().equals("white".toUpperCase()) && data.getPrice() >= 7000;
	}

	
}
