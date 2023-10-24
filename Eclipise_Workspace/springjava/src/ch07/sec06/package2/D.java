package ch07.sec06.package2;

import ch07.sec06.package1.A;

//상속관계시 다른 패키지 일 겅우 멤버가 protected 접근자 일 때 접근가능
public class D extends A{
	//생성자 선언
	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	public void method2() {
		//자식개념에서 사용하는 의미가 아니라 , 일반적인 형태로 접근하기 때문에 가능하지 않다.
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
