package ch12.sec05;

/*
 문자열 데이터 조작 관련클래스
 1)string 클래스 : 기본작업
 	-변수에 값이 변경될 때 마다 새로운 기억장소를 생성하여 사용한다
 2)StringBuilder 클래스 : 성능관점의 작업
 	-최초 생성한 기억장소 하나를 가지고 작업이 이루어진다
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
			.append("DEF") //추가
			.insert(0, "ABC") //삽입
			.delete(3, 4) //삭제
			.toString();
		
		System.out.println(data);
			
		
		
	}

}
