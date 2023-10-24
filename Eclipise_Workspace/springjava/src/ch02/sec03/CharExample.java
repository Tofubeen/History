package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		// char데이터타입(2byte): 1개의 문자를 저장하기위한 목적으로 만듬.
		// 값은 유니코드 값으로 저장 (0~65535)
		// 값은 작은따음표로 감싸야하는 규칙이있다.
		
		char c1 = 'A'; //내부적으로 65 유니코드값이 저장
		char c2 = 65; //숫자로 저장해도 위와 동일한의미 다만 작은따음표를 사용하지않음.
		
		char c3 = '가';
		char c4 = 44032;
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
	}

}
