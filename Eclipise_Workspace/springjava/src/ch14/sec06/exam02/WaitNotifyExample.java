package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//작업내용을 가지고 있는 작업객체 생성
		// 1) 작업내용을 가지고 있는 작업객체 생성
		WorkObject workObject = new WorkObject();
		
		//2)작업내용을 스레드로 관리하는 스레드 객체생성
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start(); //run() 메소드 내용 : workObject.methodA()
		threadB.start(); //run() 메소드 내용 : workObject.methodA()
	}

}
