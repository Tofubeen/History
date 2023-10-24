package ch05.sec06;

public class ArrayCreateByValueListExample02 {

	public static void main(String[] args) {
		//참조타입의 주소복사
		
		int[] scores;
		scores = new int[] {83,90,87};
		
		sum(scores);
		
//		int sum = 0;
//		for(int i = 0; i<3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum);
		
		
		printItem( new int[] {83, 90, 87});
		printItem( new int[] {50, 85, 64});
		printItem( new int[] {98, 88, 77});
	}
		//메소드정의(선언)
		//위에 printItem 코드가 읽힐때마다 선언된 메소드로 돌아가 기능을 수행한다
		public static void printItem(int[] scores) {
			int sum = 0;
		for(int i =0; i<scores.length ; i++) {
			sum += scores[i];
			
			System.out.println("score[" + i + "]: " + scores[i]);
		}
			
			System.out.println("-----------------------------");
			System.out.println("총합: " + sum);
			System.out.println("평균: " + (double) sum / scores.length);
			System.out.println("-----------------------------");
			
	}
		//합계를 구하는 메소드
		public static void sum(int[] scores) {
			int sum = 0;
			for(int i = 0; i<3; i++) {
				sum += scores[i];
		}
		System.out.println("scores 배열의 점수 총합: " + sum);
}
}
