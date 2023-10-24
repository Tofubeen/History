package ch13.sec01.exam01;

public class Product<K , M> {
	
		//필드 
		//private 타입매개변수 매개변수;
		private K kind;
		private M model;
		
		//getter, setter 메소드
		public K getKind() { return this.kind;}
		public M getModel() { return this.model;}
		public void setKind(K kind) {this.kind = kind;}
		public void setModel(M model) {this.model = model;}
		
/*
		Product<Car, String> product2 = new Product<>();
		
		public class Product<> {
	
		//필드 
		//private 타입매개변수 매개변수;
		private Car kind;
		private String model;
		
		//getter, setter 메소드
		public Car getKind() { return this.kind;}
		public String getModel() { return this.model;}
		public void setKind(Car kind) {this.kind = kind;}
		public void setModel(Strig model) {this.model = model;}
		
 */
		}
		
		


