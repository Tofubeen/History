package ch11.sec02.exam01;

//8라인에 예외발생되어 예외처리를 적용한 예제
public class ExceptionHandleingExample2 {//Exception : 예외
	
	public static void printLength(String data) {
		try {
				int result = data.length(); //참조연산자는 주소값을 가지고 있을 때 사용
				System.out.println("문자 수: " + result);
				
		} catch(NullPointerException e) {//catch(매개변수선언)
			System.out.println(e.getMessage());
		}finally {
			System.out.println("[마무리실행]");
		}
		
		
		// Q: try-catch는 예외상황이 발생하였을때만 실행되고 그것이 아니라면 기존코드대로 움직이는가
	
	
	} 
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJave"); //예외발생이 없는 경우
		printLength(null);
		
		System.out.println("[프로그램 종료]");// 이 라인은 위에서 예외발생이 되어, 정상적인 실행을 하지 못한다.
	}

}
