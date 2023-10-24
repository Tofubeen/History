package ch16.sec01.test;

public class CalculatorExample {

	public static void main(String[] args) {
		//인터페이스의 매개변수가 한개이면 괄호를 생략해도 된다 ex) int x -> .......
		
		//객체생성 할 필요가 없다.
		//람다식으로 재정의한 내용을 익명구현객체 작업
		action ((x,y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculator calculator) {
		calculator.add(10, 20);
	}
}
