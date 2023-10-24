package ch08.sec02;

//implements= "구현" 을 의미
//인터페이스의 추상메소드를 상속받는 클래스는 반드시 구현(재정의) 해야 한다(규칙)
//인터페이스는 필드와 메소드는 못가지고 추상메소드만 가질수 있음
//필드와 메소드를 가지고 있는건 클래스, 추상메소드만 가지고 있는건 인터페이스
//추상클래스는 클래스와 인터페이스에 둘다에 성격을 가지고 있음

public class Audio implements RemoteControl {
	
	public void turnOn() {
		System.out.println("Audio 켭니다");
	}
}
