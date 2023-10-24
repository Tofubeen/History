package exam2;

import java.util.Arrays;

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk sungjuk = new Sungjuk();
		
		System.out.printf("이름: %s\n", Arrays.toString(sungjuk.getName()));
		System.out.println("국어점수: " + Arrays.toString(sungjuk.getKrScore()) + " , 총점: " + sungjuk.sumKrScore());
		System.out.println("영어점수: " + Arrays.toString(sungjuk.getEnScore()) + " , 총점: " + sungjuk.sumEnScore());
		
		
		
		
		

	
	
	
	}

}
