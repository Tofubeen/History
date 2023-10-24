package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		//문자열 분리 
		//배열은 참조타입
		String board = "1,자바 학습,참조 타입 string 을 학습합니다., 홍길동";//콤마(,)를 구분자로 사용
		
		//문자열분리
		String[] tokens = board.split(",");
		
		//인덱스 별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
		
		//for문을 이용하여 읽기
		for (int i= 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
