package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		//myCar 객체 설정
		Car myCar = new Car();
		
		//setGas (5)
		myCar.setGas(5);
			
		//if LeftGas : Gas 가 존재하면 "출발합니다 : 메세지 출력하고 run()메소드 호출
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다. ");
			myCar.run();
		}
		
		
		//"gas 주입하세요" 출력
		System.out.println("gas를 주입하세요.");

	}

}
