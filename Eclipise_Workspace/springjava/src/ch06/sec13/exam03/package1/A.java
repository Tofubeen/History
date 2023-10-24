package ch06.sec13.exam03.package1;

//A와 B는 같은패키지 C는 다른 패키지

public class A {
	//필드선언
	
	//필드 (Fields):

	//설명: 필드는 클래스 내부에 선언된 변수로, 객체의 특징이나 속성을 나타냅니다.
	
	public int field1;
	
	int field2; //접근자는 default 의미
	
	private int field3;
	
	//이 필드가 new를 이용해서 힙이라는 영역에 데이터를 생성하면 초기화 해주는 목적 
	
	//생성자선언 // 필드와 메소드 접근이 가능, 즉 필드와 메소드는 클래스 내부에서 접근자는 상관이 없음
	//내부클래스에서 생성자를 생성하려 한다면 동그라미,네모,세모가 나온다
	
	//생성자 (Constructors):

	//설명: 생성자는 객체를 초기화할 때 호출되는 특별한 메소드로, 필드를 초기화하는 역할을 합니다.
	
	public A() { //  ex/  A(int a , int b)
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
	
	//메소드 (Methods):

	//설명: 메소드는 클래스 내에서 수행할 수 있는 동작 또는 기능을 정의합니다.
	
	public void method1() {}
	
	void method2() {} //default
	
	private void method3() {}
	
	
	
}
