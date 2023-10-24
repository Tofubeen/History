package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		//비교연산자
		//1) 정수데이터 
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); //같다ㅣ
		boolean result2 = (num1 != num2); // 같지않다
		boolean result3 = (num1 <= num2); // 작거나 같다
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		//2)문자데이터 
		char char1 = 'A'; //아스키코드값 65
		char char2 = 'B'; //아스키코드값 66
		boolean result4 = (char1 < char2); // 65<66
		
		//3) 정수 , 실수 혼합 비교연산 , 연산시 가장 큰 데이터 타입으로 형변환되는 규칙 (중요))
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4 ); // int == double -> (double)int === double
		
		//4)실수데이터  정밀도 (유효자리수)
		float num5 = 0.1f; //0.233619
		double num6 = 0.1;
		boolean result6 = (num5 == num6 ); //float == double ->
		boolean result7 = (num5 == (float) num6 );
		System.out.println("result6: " + result6); // false
		System.out.println("result7: " + result7); // true
		
		
		//5) 문자열데이터
		String str1 = "자바";
		String str2 = "JABA";
		boolean result8 = (str1.equals(str2) ); //str1 == str2 ->
		boolean result9 = (!str1.equals(str2));
		System.out.println("result8: " + result8); // false
		System.out.println("result9: " + result9); // true
		
		
		
		

	}

}
