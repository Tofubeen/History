package ch07.sec08.exam02;

// 운송수단: 자전거
public class Bicycle extends Vehicle {

	// 재정의
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
}
