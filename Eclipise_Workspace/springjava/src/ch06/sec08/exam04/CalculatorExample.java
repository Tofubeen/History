package ch06.sec08.exam04;

public class CalculatorExample {
	
	public static void main(String[] args) {
		
	
	
	
	// myCalcu 객체생성
	Calculator myCalcu = new Calculator();
	
	//result1 : 정사각형의 넓이 구하기 . 10
	double result1 = myCalcu.areaReactangle(10);
	//result2 : 직사각형 넓이 구하기 10, 20
	double result2 = myCalcu.areaRectangle(10, 20);
	//"정사각형의 넓이 = result1 출력
	System.out.println("정사각형의 넓이: " +result1);
	//"직사각혀의 넓이 = result2 출력
	System.out.println("직사각형의 넓이: " +result2);
	

	
	}
}
