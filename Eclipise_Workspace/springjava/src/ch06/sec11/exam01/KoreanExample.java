package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "홍길동");
		
		
		// 필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// final 필드는 값을 변경 불가능.
//		k1.nation = "잉글랜드";
//		k1.ssn = "123-12-1234";
		
		// non-final 필드는 값 변경 가능.
		k1.name = "홍삼순";

	}

}
