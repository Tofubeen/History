package ch14.sec07.exam02_2;

public class InterruptExample {

	public static void main(String[] args) {
//		PrintThread thread = new PrintThread();
		Thread thread = new PrintThread();
		thread.start();
		//start 메소드를 호출하면 run메소드는 알아서 호출된다
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		//thread객체가 관리하는 스레드에서 sleep() 메소드에 의한 일시정지 상태 일 경우, 아래 코드가 호출시 예외를 발생시킨다
		thread.interrupt(); 

	}

}
