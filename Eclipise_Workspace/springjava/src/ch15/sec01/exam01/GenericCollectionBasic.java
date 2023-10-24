package ch15.sec01.exam01;

import java.util.ArrayList;

import ch06.sec06.exam01.Car;

/*
컬렉션 : 기억장소, 객체를 저장하는 목적.
-배열비교
	-> 동일한 데이터타입으로 , 연속적인 형태의 기억장소를 하나의 이름으로 관리
	->길이가 고정되어 있어 , 길이 변경 불가능
	
예> int[] arr = new int[10];

	arr.length;
	arr.length = 10; 에러발생
	-컬렉션 특징 
	-> 컬렉션 기능을 제공하는 클래스를 통하여 , 객체를 생성 했을시 힙영역에 기본크기의 기억장소가 생성
	-> 데이터가 추가할 때마다 , 기억장소가 자동으로 생성이 되어 데이터를 저장하는 특징
	
	
제네릭 :
 */

class car {
}
class Person {
}

public class GenericCollectionBasic {

	public static void main(String[] args) {
		//컬렉션 기능을 제공하는 클래스
		//형변환이 발생하면 기능이 떨어진다
		
		//제네릭을 이용하지 않은 컬렉션 클래스 사용
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("홍길동");
		al.add(true);
		al.add(10.5);
		al.add(new Car());
		
		
		//제네릭을 이용한 컬렉션 클래스 사용
		//컬렉션 형태의 구조를 가지고 있는 기억장소는 내부적으로 데이터를 object클래스로 관리한다
		//제네릭 클래스를 사용할 경우에는 참조타입만 가능
		ArrayList<Car> a12 = new ArrayList<Car>();
//		a12.add(new Car);
//		a12.add(10);
		
		ArrayList<Person> a15 = new ArrayList<Person>();
	}

}

