package ch06.sec10.exam02;

public abstract class TelevisionExample {

	public static void main(String[] args) {
		//Television 클래스의 멤버가 모두 정적(static) 멤버이기 때문에 , 객체생성구문이 필요없다
//		Television tv = new Telvision();
//		Television tv;
		
		System.out.println(Television.info);
//		System.out.println(tv.color);
	}
	
}
