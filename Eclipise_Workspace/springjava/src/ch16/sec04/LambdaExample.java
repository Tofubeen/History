package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//실행문이 2개 이상일경우
		person.action((x , y) -> {
			double result = x + y;
			return result;
		});
		
//		//리턴문 1개 있을 경우
//		person.action((x,y) -> {
//			return x + y;
//		});
		//위와 아래는 같은 의미다
		person.action((x,y) -> (x + y));
		
		person.action((x,y) -> sum(x,y));
		
	}
	
	public static double sum(double x, double y) {
		return ( x + y);
		
	}

}
