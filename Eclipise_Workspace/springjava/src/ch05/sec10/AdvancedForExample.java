package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		//배열을 접근하기위한 향상된 for문
		
		int[] scores = {95 , 71, 84 , 93 , 87};
		
		//배열합
		int sum = 0;
		
		//1)기본
		/*
		 * for(int i = 0 ; i<scores.length; i++) {
		 * sum += scores[i];
		 * }
		 */
		
		//2)향상된 for문  -> for( 변수 : 배열) 배열에서 하나하나씩 꺼내서 변수에 저장한 후 참 일때 실행할 명령식에 대입
		for(int score : scores) { //scores 배열에 값들을 순차적으로 불러와서 score에 저장한다는 의미
			sum += score;
		}
		System.out.println("점수총합: " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수평균: " + avg);
		
	}

}
