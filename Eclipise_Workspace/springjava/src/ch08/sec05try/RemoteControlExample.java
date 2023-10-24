package ch08.sec05try;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//인터페이스에서 추상메소드는 생성했을때 예하 클래스들에게 전부 상속해야한다 안하면 에러가 난다
		
		//tv객체를 생성하고, 인터페이스 변수에 대입, 다형성
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//디폴트 메소드 호출, 부모 인터페이스의 default 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio 객체를 생성하고, 인터페이스 변수에 대입 , 다형성
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//디폴트메소드 호출, 재정의된 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		rc.turnOff();
			}
	}


