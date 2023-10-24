package ch12.sec06;

//박싱과 언박싱 예제
public class ValueCompareExample {

	public static void main(String[] args) {

		//참조타입 변수= 기본데이타타입 int형 값;
		//300 이라는 값이 힙영역에 메모리가 생성이 되어 저장하고, 그 곳은 주소가 할당된다 (Boxing)
		
		//-127~ 127 초과 값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		
		//값비교시 ==, != 사용하지말고, equals()메소드 사용할것 (재정의 되어 내부의 값이 비교된다)
		System.out.println("--: " + (obj1 == obj2)); //false
		System.out.println("equals(): " + obj1.equals(obj2)); //true 내부 값 비교시 사용
		
		//-127~ 127 범위 값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: " + (obj3 == obj4)); //true
		System.out.println("equals() " + obj3.equals(obj4)); //true 값비교시 사용
	}

}
