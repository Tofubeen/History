package ch14.sec06.exam02;
//스레드 클래스: 작업내용을 독립적연 형태로 관리하는 목적
/*
1) 스레드 클레스 상속 : run()메소드 재정의
2)Runnable 인터페이스 구현 : run() 메소드 재정의(구현)
쓰레드는 작업을 독립적으로 하기위해 만드는 의미가 있다(main스레드 영향받지 않게)
 */
public class ThreadB extends Thread{

	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
		public void run() {
		for(int i = 0 ; i<10 ; i++) {
			workObject.methodB(); //실질적인 작업내용
		}
	}
}
