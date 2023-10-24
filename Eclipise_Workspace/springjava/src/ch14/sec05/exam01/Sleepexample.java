package ch14.sec05.exam01;

import java.awt.Toolkit;

//스레드 상태

public class Sleepexample {

	public static void main(String[] args) {
		//tookit 객체가 존재하게 함
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<10 ; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(3000); //실행상태가 3초간 일시정지 , 3초후에 스레드는 대기상태로 전환된다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
