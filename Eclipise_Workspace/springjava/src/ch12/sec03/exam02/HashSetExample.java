package ch12.sec03.exam02;

import java.util.HashSet;

//HashSet 컬렉션 클래스: 객체를 저장시 사용하는 기능제공, 동일객체를 중복저장 불가능
//이 예제를 테스트 할 경우 student 클래스의 hashSet() , equals() 재정의 구문을 주석으로 번갈아가면  
public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); //s1 객체가 추가될 때 중복검사후 추가
		System.out.println("저장된 객체 수: " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
	}

}
