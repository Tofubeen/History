package ch06.sec10.exam01;

public class Calculator {
	//main()메소드가 시작 될때, 메소드 영역에 정적(static)멤버의 기억장소가 생성이 된다.
	
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x , int y) {
		return x - y;
	}
	
	
}
