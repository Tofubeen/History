package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread(); //스레드상태 : new
		sumThread.start(); //스레드상태 : runnable (대기 -> cpu스케줄링에 의하여 , cpu 점유를 받아 실행
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {// main 스레드가 일시정지 상태가 된다. sum Thread가 동작이 완료되면 , main 스레드는 대기상태
			e.printStackTrace();
		}
		
		System.out.println("1~100합: " + sumThread.getSum());
	}

}
