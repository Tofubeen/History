package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		
		//Member 클래스를 hashcode()와 equals() 메소드를 재정의하여 , 동일한 객체가 중복 저장되지 않게 한다
		System.out.println("총 객체수: " + set.size());
		
		
	}
	//재정의를 할때 hashcode와 equals 를 써서 중복검사를 해준다
	

}
