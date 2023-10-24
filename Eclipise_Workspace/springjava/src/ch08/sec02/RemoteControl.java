package ch08.sec02;

//인터페이스는 상속목적으로 설계, 추상클래스는 동일 . new를 이용한 객체생성작업은 불가능하다.
public interface RemoteControl {

//	//일반 메소드 선언 불가능
//	public void turnOn() {
//		System.out.println();
//	}
	
	//추상메소드
	//인터페이스 컴파일 과정에서 abstract가 자동으로 붙는다 , 그러므로 안달아도 자동으로 붙는다
	
	 // 컴파일작업 public abstract void turnOn();로 됨
	
	
	//객체생성 불가능
//	RemoteControl remoteControl = new RemoteControl();
	
	public void turnOn() ;
}
