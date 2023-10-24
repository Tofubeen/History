package ch05.sec11;

/*
 * 명령프로프트 기반에서 파일을 독립적으로 실행
 * javac MainStirngArrayArgument.java
 * java MainStirngArrayArgument 10 20
 */

/*
 * 현재 이클립스 예제는 run메뉴 - run configuration(실행구성) 에서 클래스 MainStirngArrayArgument 확인
 * 				-argument(인수) 매개변수값 10 20 -run 클릭
 */

public class MainStirngArrayArgument {

	public static void main(String[] args) {
		//jvm 구동되면서 , 자바프로그램의 main()시작 메소드를 호출한다
		//String[] args 사용법
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); //프로그램 종료하는 기능
			
		}
		//main() 메소드의 매개변수를 2개 제공한 경우
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		//문자열을 정수형으로 변환. 예) "10" -> 10변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
