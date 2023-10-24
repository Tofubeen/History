package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//작업자 스레드 생성
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//작업. "띵" 소리
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i<5; i++) {
					toolkit.beep();
					//0.5초 일시정지하는 기능
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
		
		thread.start(); //내부적으로 run()메소드가 동작된다
		
		//위의 작업으로 main메소드로 부터 독립적인 스레드로 분리된다.
		
		//작업2: "띵" 문자열 출력. main스레드 작업
			for(int i = 0; i<5; i++) {
				System.out.println("띵");
				//0.5초 일시정지하는 기능
				try { Thread.sleep(500);} catch(Exception e) {}
			}
		}
	}