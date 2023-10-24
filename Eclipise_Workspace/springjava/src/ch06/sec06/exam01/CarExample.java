package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();
//		Car myCar = null; 참조연산자로 인한 작업은 에러발생된다 (이미 정해진 값이 있기 때문에?)
				//new는 car라는 클래스의 내용을 가져와 힙영역에 내용을 생성한다
				//new 옆에 생성자메소드는 클래스명과 똑같다(굳이 안써도 컨트롤+스페이스 누르면 자동 쓰여짐 
				//myCar라는 객체가 힙영역에 생성되고 내용은 Car클래스의 내용을 가진다
		
		//Car 클레스로 만들어진 객체가 생성된 힙 영역의 기억장소를 접근
		//필드값 읽기 
		// . : 참조연산자
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
		
		
		
	}

}
