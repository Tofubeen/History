package ch07.sec10.exam02;

//추상클래스는 abstract 키워드를 적용하면 된다
//추상메소드를 1개라도 가지고 있으면 , 클래스에 abstract를 달아줘야 한다
public abstract class Animal {
	
	
	//메소드의 구성
	/*
	 1) header - void method()
	 2) body -	 {    
	 					}
	*/
	
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//추상메소드 ( 메소드 뒤에 중괄호 {본문} 를 뺀 메소드)
	//body가 없다 = 중괄호{ }가 없다 
	//에러를 없앨려면 abstract를 달아줘야 한다
	abstract void sound();
	
	
	
}
