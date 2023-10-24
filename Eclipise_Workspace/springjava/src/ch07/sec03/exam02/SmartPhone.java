package ch07.sec03.exam02;

public class  SmartPhone extends Phone{
	//자식클래스
	
	//public class (자식클래스) 확장 (부모클래스)
//	smartPhone라는 자식클래스에 Phone 이라는 부모클래스에 있는 메소드와 클래스를 상속한다는 의미 
		
	public SmartPhone(String model, String color) {
		super(model, color);// 부모클래스가 기본생성자 생성되지 않으므로, 매개변수가 있는 부모클래스의 생성자를 호출한다
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}

}
