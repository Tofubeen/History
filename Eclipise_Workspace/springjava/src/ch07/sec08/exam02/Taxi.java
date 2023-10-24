package ch07.sec08.exam02;

public class Taxi extends Vehicle {

	// 재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
