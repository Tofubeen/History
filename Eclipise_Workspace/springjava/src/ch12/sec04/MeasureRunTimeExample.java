package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime(); // 1970년 1월1일 기준
		int sum = 0;
		for( int i = 1; i<=1000000; i++) {
			sum += 1;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " +(time2-time1) + " 나노초가 소요됨");
	}

}
