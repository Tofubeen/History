package ch14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		//스레드 객체생성
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		printThread.setStop(true);
		
	}
		
}