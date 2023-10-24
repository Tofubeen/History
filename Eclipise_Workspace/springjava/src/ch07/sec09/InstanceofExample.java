package ch07.sec09;

public class InstanceofExample {

	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		/*
		if(person instanceof Student) {
			System.out.println("Student 객체입니다.");
		} else {
			System.out.println("Student 객체가 아닙니다.");
		}
		*/
		
		// Student student = (Student) person; 직접 입력 불가
		// personInfo(p1) 호출 시 false, personInfo(p2) 호출 시 true  
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("-----------------------------------");
			System.out.println("studentName: " + student.name);
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		// JDK 12 version
		/*
		if(person instanceof Student student) {
		System.out.println("studentName: " + student.name);
		System.out.println("studentNo: " + student.studentNo);
		student.study();
		}
		*/
		
	}
	
	public static void main(String[] args) {

		// person instanceof Student → false
		Person p1 = new Person("홍길동");	
		personInfo(p1); // new 연산자가 힙 영역에 생성한 기억장소의 주소가 전달
	
		// person instanceof Student → true
		Person p2 = new Student("손흥민", 10); // 자동 형 변환
		personInfo(p2);
	}

}
