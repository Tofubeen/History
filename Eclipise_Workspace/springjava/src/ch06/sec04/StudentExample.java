package ch06.sec04;

public class StudentExample {
	
	//시작메소드
	public static void main(String[] args) {

		//클래스 사용법.
		Student s1 = new Student();//클래스명과 생성자메소드 이름은 같아야 한다
		//s1은 힙영역의 주소가 존재한다. 주소를 찾아가서 정보(필드, 메소드) 를 사용하게 된다.
		System.out.println("s1변수가 Student 객체를 참조한다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
	}

}
