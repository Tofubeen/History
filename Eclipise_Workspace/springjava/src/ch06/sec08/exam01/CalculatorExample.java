package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//myCalc
		Calculator myCalc = new Calculator();
		
		//계산기 전원 On
		myCalc.powerOn();
		
		//5 , 6
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 :" + result1 );
		
		int x = 10;
		int y = 4;
		
		double result2 =myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		int result3 = myCalc.minus(5, 15);
		System.out.println("result3: " + result3);
		
		
		
		int result4 = myCalc.multifly(5, 10);
		System.out.println("result4: " + result4);
		
		//계산기 전원 Off
		myCalc.powerOff();
		
		
		
		
	}

}
