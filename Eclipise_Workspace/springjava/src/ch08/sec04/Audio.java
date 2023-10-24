package ch08.sec04;

public class Audio implements RemoteControl {
	
	//인터페이스를 상속받는 클래스는 인터페이스의 추상메소드를 구현해야 하는 문법적인 규칙때무에 이 작업이 툴에서 제공해주고 있다
	
	//필드, 현재 오디오 볼륨상태	private int volume;
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		//볼륨, 최대 10, 최소 0
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME ) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

}
