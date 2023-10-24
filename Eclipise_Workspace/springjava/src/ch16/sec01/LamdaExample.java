package ch16.sec01;

/*
람다식의 구문이 매개변수에 대입하는 형태
함수형 인터페이스의 추상메소드를 람다식 문법으로 재정의하여, 인터페이스 매개변수에 대입하는 형태
*/
public class LamdaExample {

	public static void main(String[] args) {
//		람다식 문법을 사용하지 않고 , 기본으로 표현한 형태
//		Calculable calculable = new CalculableImpl();
//		calculable.calculate(10, 20);
		
//		람다식 문법.(중괄호는 재정의를 의미), (Calculable 인터페이스의 추상메소드 void calculate(int x, int y);를 재정의한 내용
		action((x,y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x,y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});	
				
	}
	/*
	 public void calculate(int x, int y) {
		int result = x + y;
		System.out.println("result: " + result);
	}
	람다식 action 밑에 있는 매개변수에 calculable에 전달되면 내부적으로 위에 코드가 생성되어 //데이터처리 밑에 코드가 작동하며 위에 코드가 실행된다
	 */
	private static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		
		//데이터 처리
		calculable.calculate(x, y);
	}

}
