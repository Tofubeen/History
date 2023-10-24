package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//작업자 스레드 생성방법2
		Thread thread = new Thread() {
			
		//run메소드는 Runnable로 생성할수도 있지만 스레드 자체를 생성했을때도 자체적으로 생성되므로 결론은 어떻게 하든 생성은 된다
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
			
	};
	thread.start();
	
	//작업2: "띵" 문자열 출력. main스레드 작업
	for(int i = 0; i<5; i++) {
		System.out.println("띵");
		//0.5초 일시정지하는 기능
		try { Thread.sleep(500);} catch(Exception e) {}
	}

}
}
