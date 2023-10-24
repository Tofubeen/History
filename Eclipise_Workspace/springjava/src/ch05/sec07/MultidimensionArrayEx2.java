package ch05.sec07;

public class MultidimensionArrayEx2 {

	public static void main(String[] args) {
		/*
		int[][] mathScores = new int[행의수][열의수];
		*/
		
		//int형 배열의 초기값이 0으로 만들어진다
		int[][] mathScores = new int[2][3]; //2*3 (2행의3열의 2차원 배열구조)
		for(int i = 0; i<mathScores.length;i++) {
			for(int  k =0; k<mathScores[i].length ; k++) {
				System.out.println("mathScores[" + i + "][" + k +"]: " + mathScores[i][k]);
			}
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		//배열항목의 값 변경
		//첫번째행
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		//두번째행
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		//전체학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		
		for(int i = 0; i<mathScores.length;i++) {
			totalStudent += mathScores[i].length;
			for(int  k =0; k<mathScores[i].length ; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		//평균점수
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체학생의 수학 평균: " + totalMathAvg);
		System.out.println();
		System.out.println("-----------------------------");
		
		//가변배열(jagged array) : 행마다 열의 크기가 다르게 사용되는 특징. 톱모양
		int[][] englishScores = new int[2][]; //열의 크기를 생략
		englishScores[0] = new int[2]; //첫번째 행은 열의 크기를 2 설정
		englishScores[1] = new int[3]; //두번째 행은 열의 크기를 3 설정
		
		for(int i = 0; i<englishScores.length;i++) {
			for(int  k =0; k<englishScores[i].length ; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
			}
		}
		System.out.println("-----------------------------");
		
		System.out.println();
		
		
		// 90 ,91, 92, 93, 94
		
//		englishScores 배열 위의 값을 대입하는 구문
		
		//배열항목의 값 변경
				//첫번째행
				englishScores[0][0] = 90;
				englishScores[0][1] = 91;
				//두번째행
				englishScores[1][0] = 92;
				englishScores[1][1] = 93;
				englishScores[1][2] = 94;
				
				int total1Student = 0;
				int totalEnglishSum = 0;
				for(int i = 0; i<englishScores.length;i++) {
					total1Student += englishScores[i].length;					
					for(int  k =0; k<englishScores[i].length ; k++) {
						totalEnglishSum += englishScores[i][k];
						System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
					}
				}
				
				System.out.println("-----------------------------");
				double totalEnglishAvg = (double) totalEnglishSum/ total1Student;
				System.out.println("전체학생의 영어점수 평균: " + Math.round(totalEnglishAvg));
	}

}
