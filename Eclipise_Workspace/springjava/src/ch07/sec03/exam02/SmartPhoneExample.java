package ch07.sec03.exam02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색"); //여기까지 컴파일을 실행하면 부모클래스와 자식클래스만 실행된다
	
	System.out.println("모델: " + myPhone.model);
	System.out.println("색상: " + myPhone.color);
	myPhone.bell();
	myPhone.answer();
	}
}
