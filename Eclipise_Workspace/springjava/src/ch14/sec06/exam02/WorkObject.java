package ch14.sec06.exam02;

//스레드에서 사용 할 작업내용을 가지고 있는 클래스
//notify와 wait클래스는 스레드 클래스가 아닌 오브젝트 클래스에서 제공
public class WorkObject {
	
	
	//생산자기능 : 마트의 진열대에 우유를 보관
	public synchronized void  methodA() {
		Thread thread = Thread.currentThread(); //현재 실행하고 있는 스레드를 참조 (첫 실행때는 main스레드)
		System.out.println(thread.getName() + ": methodA() 작업실행");
		notify(); //wait()로 일시정지 상태에 있는 스레드를 대기(Runnable) 상태로 변경
		try {
			wait();//현재 실행 스레드를 일시정지 상태로 변경.
		} catch (InterruptedException e) {
		}
	}
	
	//소비자기능: 마트의 진열대에 우유를 소비
	public synchronized void methodB() {
		Thread thread = Thread.currentThread(); //현재 실행하고 있는 스레드를 참조 (첫 실행때는 main스레드)
		System.out.println(thread.getName() + ": methodB() 작업실행");
		notify(); //wait()로 일시정지 상태에 있는 스레드를 대기(Runnable) 상태로 변경
		try {
			wait();//현재 실행 스레드를 일시정지 상태로 변경.
		} catch (InterruptedException e) {
		}
	}
	
	
}
