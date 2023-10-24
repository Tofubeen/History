package ch06.sec08.exam05;

public class CarExample {

	public static void main(String[] args) {
		// new: 메모리 생성연산자 , Car클래스의 인스턴스 멤버를 가지고 , 힙영역에 메모리를 생성한다.
		//				정적(satic) 멤버는 제외된다.
		Car myCar = new Car("포르쉐");
//		myCar.color // 정적멤버를 myCar 객체로 접근하여 사용은 가능하지만, 권장은 안한다. 
		
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
