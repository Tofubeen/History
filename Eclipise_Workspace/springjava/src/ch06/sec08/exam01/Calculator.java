package ch06.sec08.exam01;

public class Calculator {
	
	//리턴값이 없는 메소드 : void
	void powerOn() {
		System.out.println("전원을 켭니다"); //powerOn() 호출(실행) 하고 ,호출한쪽으로 제어가 넘어간다.
	}
	
	//리턴값이 없는 메소드
//	데이터타입 메소드명(매개변수) {}
	
	void powerOff() {
		System.out.println("전원을 켭니다");
	}
	
	//두 정수를 입력받아 더하는 기능
	int plus(int x, int y) {
		int result = x + y;
		return result; // plus() 메소드를 호출한 코드에 값을 돌려주는 기능
	}
	
	//빼기기능 minus()
	int minus (int x, int y) {
		int result = x - y;
		return result;
	}
	
	//두 정수의 값을 입력받아 나누는 기능
	double divide(int x , int y) {
		double result = (double) x / y;
		return result;
	}
	
	int multifly( int x, int y) {
		int result = x * y;
		return result;
	}
}
