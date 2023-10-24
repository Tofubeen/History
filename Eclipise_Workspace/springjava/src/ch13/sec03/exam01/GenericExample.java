package ch13.sec03.exam01;

public class GenericExample {
	
	//제네릭 메소드
	//	<T> 리턴타입<T> 메서드명 (T 매개변수);
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100); //<Integer> Box<Integer> boxing(Integer, t)
					//위에 <Integer>은 T가 Integer을 받고 다른 T들에게 뿌려준후  사라진다
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동"); // Box<String> boxing<String , t>
		String strValue = box2.get();
		System.out.println(strValue);
		
	
		
	}

}
