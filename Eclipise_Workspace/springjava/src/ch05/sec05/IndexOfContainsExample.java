package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		//문자열 찾기
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //검색문자열이 존재하지 않으면 -1 을 반환
		System.out.println(location);
		
		//	substring(문자열추출)
		
		//1
		String word1 = subject.substring(3);
		System.out.println(word1);
		
		//2
		String word2 = subject.substring(location);
		System.out.println(word2);
		
		String word = subject.substring(3);
		System.out.println(word);
		
		//3
		location = subject.indexOf("스프링");
		if(location != -1) {
			System.out.println("자바와 관련된 책입니다");
		} else {
			System.out.println("자바와 관련된 책이 아닙니다");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
