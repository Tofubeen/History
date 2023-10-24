package ch05.sec03;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		//null에러
		int [] intArray = null;
		//intArray 변수에는 힙영역 생성된 주소가 없기 때문에 , 값을 대입할수가 없다
		intArray[0] = 10; // nullPointerexception 에러가 발생                    r
		
		
	}

}
