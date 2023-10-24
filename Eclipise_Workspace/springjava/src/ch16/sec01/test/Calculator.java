package ch16.sec01.test;

@FunctionalInterface //추상메소드가 하나일경우 안달아도 알아서 생성
public interface Calculator {

	void add(int x , int y);
	
//	void substract(int x , int y);
//@FunctionalInterface를 달아서 함수형 인터페이스라 명시하면 추상 메소드를 복수로 만들경우 에러가 뜬다
}
