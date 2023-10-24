package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		//string클래스의 초기값 설정
		//참조타입의 변수는 초기값을 떠나 null로 한다
		
		String hobby =""; //null보다는 "" 빈문자열을 주로 사용한다.(null을 쓰면 참조할수없으므로 에러가 뜸
		if(hobby.equals("")) { //hobby 뒤에 .은 참조 연산자
			System.out.println("hobby 변수가 참조하는 string 객체는 빈 문자열.");
		}
	}

}
