package ch05.sec07;

public class MultidimensionArrayEx01 {

	public static void main(String[] args) {
		//다차원 배열
		/*
		 int[] arr; 1차원 배열
		 int[][]arr; 2차원 배열
		 int[][][]arr; 3차원 배열
		 
		 1차원 배열
		 int[]arr = {80, 90, 96};
		 arr.length = 3
		 arr[0] = 80
		 arr[1] = 90
		 arr[2] = 96
 		 
		 */
		
		//2차원 배열 생성
		int[][] scores = {
				{80 , 90 , 96},	//1반 scores[0] = 1행
				{76, 88}		//2반 scores[1] = 2행
				};
		
		//배열의 길이
		System.out.println("1차원 배열의 길이(반의 수) : " + scores.length); //행의 개수
		System.out.println("2차원 배열의 길이(첫번째 반의 학생수): " + scores[0].length); //학생수 
		System.out.println("2차원 배열의 길이(두번째 반의 학생수): " + scores[1].length); //학생수
		
		//첫번째 반의 3번째 학생의 점수 읽어 오기
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		//두번째 반의 2번째 학생의 점수 읽어오기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫번째 반의 평균점수 구하기
		int class1Sum = 0;
		for(int i = 0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫번째 반의 평균점수: " + Math.round(class1Avg));
		
		//두번째 반읜 평균점수 구하기
		int class2Sum = 0;
		for (int i = 0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg =(double) class2Sum / scores[1].length;
		System.out.println("두번째 반의 평균점수: " + Math.round(class2Avg));
		
		//전체학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for ( int j = 0; j<scores[i].length ; j++) {
				totalSum += scores[i][j];
//				totalStudent++;
			}  	
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균점수: " + totalAvg);
	}

}
