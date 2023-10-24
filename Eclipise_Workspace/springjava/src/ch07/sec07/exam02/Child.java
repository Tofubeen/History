package ch07.sec07.exam02;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	//총 4개의 사용할수있는 메소드가 있다 
	//부모 메소드 1,2 child메소드 2,3
	
}
