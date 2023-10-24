package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		//문자열 연결 연산자 : +
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
		//결합연산. 숫자와 문자열이 연산시 결과는 String 이다
		//숫자가 문자열을 + 연산자를 만나면, 문자열로 변환된다 (중요)*99999999999999999999999
		
		
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
		
		
	}

}
