package ch08.sec05try;

public interface RemoteControl {

		//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드
	//원래는 메소드를 써서는 안된다 그러나 디폴트 메소드를 작성하면 각 프로젝트에서 재선언을 안해도 에러가 나지않는다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
