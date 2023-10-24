package ch04;

public class gugudan {

	public static void main(String[] args) {
		//구구단 예제 실습
		
//	System.out.println(); //줄바꿈있음
		
//	System.out.print(); //줄바꿈 없음
		
// 	System.out.printf(); //포멧터기능

		for(int i = 1 ; i <= 9 ; i++) {
			for(int j=1; j <=9 ; j++) {
				if(i==1) {
					System.out.printf("[  %d 단]", j);
				}else {
				System.out.printf("%d*%d=%2d\t",j,i, j*i );
			}
			}
			System.out.println();			
		}
		
	}

}
