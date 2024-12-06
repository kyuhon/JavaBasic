package kr.co.kh.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product>list = new ArrayList<Product>();
		list.add(new Product(1,"NoteBook",100));
		list.add(new Product(2,"Computer",150));
		list.add(new Product(3,"washing",300));
		list.add(new Product(4,"tv",400));
		
		List<String> result = list.stream().filter(p ->p.price >= 300).map(p -> p.name).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
