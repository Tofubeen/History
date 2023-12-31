package ch13.sec03.exam01;

//제네릭 클래스 정의: 클래스명<T>
//제네릭 클래스 사용: 예)Box<String> b1 = new Box<>();
//				  Box b1 = new Box();
public class Box<T> {
	
	//필드 
	private T t;
	
	//getter 메소드
	public T get() {
		return t;
	}
	
	//setter 메소드 
	public void set(T t) {
		this.t = t;
	}
}
