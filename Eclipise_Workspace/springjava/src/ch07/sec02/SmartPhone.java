package ch07.sec02;

public class SmartPhone extends Phone {
	//public class (자식클래스) 확장 (부모클래스)
//	smartPhone라는 자식클래스에 Phone 이라는 부모클래스에 있는 메소드와 클래스를 상속한다는 의미 
	
	//필드선언 
	public boolean wifi;
	
	//생성자선언
	public SmartPhone(String model, String color) {
		//super(): //컴파일과정에서 부모클래스의 기본생성자를 호출하는 이 구문이 자동생성됨
		this.model = model;
		this.color = color;	
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
		
	}
	
	public void internet () {
		System.out.println("인터넷에 연결합니다.");
	}
}
