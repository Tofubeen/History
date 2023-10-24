package ch07.sec04.exam01;

public class Computer extends Calculator {
//클래스 생성창에서 수퍼클래스를 지정하면 그 수퍼클래스가 부모클래스로 지정되어 생성된다
	
	
	
	
	
	//Override // Annotation. 컴파일러에게 재정의된 메서드임을 제공하는 목적
	public double areaCircle (double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
