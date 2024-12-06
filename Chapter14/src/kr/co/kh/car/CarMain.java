package kr.co.kh.car;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<Car>();
		List<Car> list2 = null;
		
		
		list.add(new Car(1, "BENS SCLASS", "BLACK", 11000));
		list.add(new Car(2, "BNW 9", "BLUE", 8000));
		list.add(new Car(3, "KEA 9", "WHITE", 7000));
		
/*		//하얀색 차를 찾아서 list2 집어넣어줘
		for(Car data : list) {
			if(data.getColor().equals("white".toUpperCase())) {
				list2.add(data);
			}
		}
		
		//출력
		for(Car data : list2) {
			System.out.println(data.toString());
		}
*/
		//1단계 우리가 함수를 만들어서 진행한다.
		
		MyCarPredicate mcp = new MyCarPredicate();
		list2 = filterCar(list,mcp);
		for(Car data : list2) {
			System.out.println(data.toString());
		}
		
		
		// 2단계 임시객체
		CarPredicate cp = new CarPredicate() {
			@Override
			public boolean test(Car data) {
				return (data.getColor().equals("black".toUpperCase()) && data.getPrice() >= 10000);
			}
		};
		list2 = filterCar(list,cp);
		for(Car data : list2) {
			System.out.println(data.toString());
		}
		
		//3단계 임시객체
			list2 = filterCar(list, new CarPredicate() {
				@Override
				public boolean test(Car data) {
					return (data.getColor().equals("blue".toUpperCase()) && data.getPrice() >= 8000);
				}
			});
			for(Car data : list2) {
				System.out.println(data.toString());
			}
			
		// 4단계 람다식	
			list2 = filterCar(list, data ->(data.getColor().equals("blue".toUpperCase()) && data.getPrice() >= 8000));
			for(Car data : list2) {
				System.out.println(data.toString());
			}
	}
	//필터링함수
//	private static List<Car> filterCar(List<Car> list, String color, int price) {
//		List<Car> list2 = new ArrayList<Car>();
//		for(Car data : list) {
//			if(data.getColor().equals(color.toUpperCase()) && data.getPrice() >= price) {
//				list2.add(data);
//			}
//		}
//		return list2;
//	}
	// 필터링함수
//	private static List<Car> filterCar(List<Car> list, String color, int price) {
//		List<Car> list2 = new ArrayList<Car>();
//		for(Car data : list) {
//			if(data.getColor().equals(color.toUpperCase()) && data.getPrice() >= price) {
//				list2.add(data);
//			}
//		}
//		return list2;
//	}
	private static List<Car> filterCar(List<Car> list, CarPredicate cp) {
		List<Car> list2 = new ArrayList<Car>();
		for(Car data : list) {
			if(cp.test(data)) {
				list2.add(data);
			}
		}
		return list2;
	}

}
