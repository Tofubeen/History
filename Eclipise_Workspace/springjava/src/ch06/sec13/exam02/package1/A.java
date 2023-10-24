package ch06.sec13.exam02.package1;

	//생성자 접근자 예제. public private , 생략시(default)
	//자신의 클래스에서 생성자의 접근자는 의미가 없다.
	
//	public: 패키지와 상관없이 접근가능
//	[default] : 같은 패키지 접근
//	private : 클래스안에서만 접근

public class A {
	//필드 선언
	//자신의 클래스를 가지고 객체생성가능
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	
	//생성자선언
	public A(boolean b) {}
		
		//접근자가 생략되면, default 의미.
		A(int b) {}
		
		private A(String s) {}
	
}
