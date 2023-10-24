package ch13.sec01.exam01;

import ch15.sec01.exam01.Eeokeon;

public class GenericExample {

	public static void main(String[] args) {

		//제네릭
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//product2 객체 <Car, String>
		//모델 : SUV자동차
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		//product3객체 ,<Eeokeon, string>
		//모델 : 에어컨
		
		Product<Eeokeon, String> product3 = new Product<>(); 
		product3.setKind(new Eeokeon());
		product3.setModel("에어컨");
		
		Eeokeon Eeokeon = product3.getKind();
		String eeokModel = product3.getModel();
		
		
		//제네릭을 사용하지 않으면 타입이 objects 클래스로 관리
		Product product = new Product();
		
		
		}

}
