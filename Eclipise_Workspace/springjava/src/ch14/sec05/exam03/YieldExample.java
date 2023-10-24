package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("WorkThreadA");
		WorkThread workThreadB = new WorkThread("WorkThreadB");
		
		
		//5초간 자기 자신을 일시정지 . main스레드
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(5000);} 
		catch (InterruptedException e) {}
		workThreadA.work = false; // workThreadA는 대기상태가 되고 다른스레트에게 양보
		
		try {Thread.sleep(5000);} 
		catch (InterruptedException e) {}
		workThreadA.work = true;
	}

}
