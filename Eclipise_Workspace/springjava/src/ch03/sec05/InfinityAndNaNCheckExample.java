package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// 0.0으로 몫 또는 나머지를 구할 때 문제되는 예제 및 해결
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y ;
		double z2 = x % y ; 
		
		System.out.println(z1); //infinity
		System.out.println(z2); //NaN
		
		System.out.println(z1 + 2); //infinity
		System.out.println(z2 + 2); //NaN 
		
		//알맞은 코드
		if(Double.isInfinite(z1) || Double.isNaN(z1)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z1 + 2);
		}
	}

}
