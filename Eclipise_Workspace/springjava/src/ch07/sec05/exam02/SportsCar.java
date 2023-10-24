package ch07.sec05.exam02;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	/*stop 메소드는 재정의 안됨. 부모클래스에서 final 키워드가 선언되어있음
	@Override
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	*/
}
