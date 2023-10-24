package ch06.sec10.exam02;
// 정적 블럭{ ... } : 정적필드를 초기화 하는 작업에 사용
public class Television {

	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	String color = "노란색"; 
	
	//정적블럭:  정적멤버필드를 초기화 작업.
	//블럭 {} : 제어문, 반복문 ,실행문자릉등 구분을 사용할 수가 있다
	static {
		info = company + " " + model;
		System.out.println("정적블럭호출");
	}
	
	Television() {
		company = "" ;
	}
	//현재 클래스에 인스턴스 멤버가 존재할 경우에 
	
}
