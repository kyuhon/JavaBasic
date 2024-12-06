package kr.co.kh.product2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product2Main {

	public static void main(String[] args) {
		
		List<Product2> list = new ArrayList<Product2>();
		
		list.add(new Product2(1,"computer",350));
		list.add(new Product2(2,"mp3",30));
		list.add(new Product2(3,"audio",100));
		list.add(new Product2(4,"monitor",50));
		list.add(new Product2(5,"washingdish",500));
		list.add(new Product2(6,"TV",400));
		
		Stream <Product2> stream = list.stream();
		Stream <Product2> stream2 = stream.filter(t->t.price >= 300);
		Stream <String> stream3 = stream2.map((Product2 t)-> t.name);
		List <String> stream4 = stream3.collect(Collectors.toList());
		
		System.out.println(stream4);
		
		
		
	}

}
