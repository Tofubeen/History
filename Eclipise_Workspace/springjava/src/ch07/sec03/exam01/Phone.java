package ch07.sec03.exam01;

public class Phone {
	//부모클래스
	
	//public class (자식클래스) 확장 (부모클래스)
//	smartPhone라는 자식클래스에 Phone 이라는 부모클래스에 있는 메소드와 클래스를 상속한다는 의미 
		
	
	//필드 선언
	public String model;
	public String color;
	
	//기본생성자 선언
		public Phone() {
			System.out.println("Phone() 생성자 실행");
		}
	
	public void bell() {
		System.out.println("벨이 울리네요~");
	}
	public void answer() {
		System.out.println("그대가 다가오죠~");
	}
	
}
