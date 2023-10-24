package ch18.sec10;

import java.io.Serializable;

//객체 직렬화 작업에 사용될 클래스는 Serializable 인터페이스를 상속(구현)해야 한다
public class Product implements Serializable{
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		
			
		
	}
	
	@Override
	public String toString() {
		return name + ": " + price;
	}
	
}
