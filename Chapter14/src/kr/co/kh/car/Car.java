package kr.co.kh.car;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable,Comparable<Car>{
	private int num; // pk(num,name)
	private String name;
	private String color;
	private int price;
	
	public Car() {
		this(0,null,null,0);
	}
	public Car(int num, String name, String color, int price) {
		super();
		this.num = num;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//오버라이딩(toSring, equals, hashcode, compareTo);
	@Override
	public String toString() {
		return "Car [" + num + ", " + name + ", " + color + ", " + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(num, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car car))
			return false;
		return num == car.num && Objects.equals(name, car.name);
	}
	@Override
	 public int compareTo(Car car) {
	        return num - car.num;
	    }
	
}
