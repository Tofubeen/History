package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "123456-1234567");

		
		// 연예계 입문 이름변경.
//		k1.name = "GD";
		
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("손흥민", "654321-7654321");		
	
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println();
		

	}

}
