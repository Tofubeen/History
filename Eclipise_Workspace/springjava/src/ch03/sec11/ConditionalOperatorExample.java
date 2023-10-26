package ch03.sec11;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		//3항연산자
		int score = 85;
		char grade = (score > 90 ) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		//if문 printf() 사용해서 코드 처리
		
		if (score > 90) {
			grade = 'A';
			
		}else if (score > 80) {
			grade = 'B';
		}else {
			grade = 'C';
		}
		//%d, %c, %f, %s
		System.out.printf("%d점은 %s등급 입니다",score, grade);
	}

}