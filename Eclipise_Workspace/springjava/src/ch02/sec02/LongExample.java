package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		//long데이터타입 : 크기가 8byte 범위 - 2^63 ~ 2^63-1
		
		long var1 = 10; // 10은 int형
		long var2 = 20L; //long데이터타입은 L or l 접미사로 사용한다.
		//long var3 = 1000000000000; 값이 int형으로 인식되기떄문에 에러발생 .  int행의범위를 벗어났다.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
