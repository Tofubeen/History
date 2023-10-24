package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		
//		SmartTelevision st = new SmartTelevision(); // 3개의 메소드가 사용가능 
		
		RemoteControl rc = new SmartTelevision();
//		RemoteControl 인터페이스에 선언된 추상메서드로 재정의된 메소드만 사용가능
		rc.turnOn();
		rc.turnOff();
//		rc.seacch(); 사용 불가능
		
		Searchble searchble = new SmartTelevision();
		//searchble 인터페이스에 선언된 추상메서드로 재정의된 메소드만 사용가능
		searchble.search("https://www.youtube.com/");
//		searchble.turnOn(); // 사용불가능
//		searchble.turnOff(); // 사용 불가능
	}

}
