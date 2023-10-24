package ch14.sec08;

public class DarmonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);// 데몬스레드. 주스레드가 종료되면 , 따라서 함께 종료된다
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("메인 스레드 종료");
	}

}
