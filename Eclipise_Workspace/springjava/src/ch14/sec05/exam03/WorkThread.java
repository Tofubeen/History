package ch14.sec05.exam03;


//스레드로 사용할 클래스
public class WorkThread extends Thread{

	
	//필드
	public boolean work = true;
	
	//생성자
	public WorkThread(String name) {
		setName(name); //스레드 이름을 정의용도
	}

	@Override
	public void run() {
		while (true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			}else {
				Thread.yield(); // 자신의 스레드는 대기상태가 되고 , 스레드의 cpu 점유를 다른 스레드에게 양보
				
				
				
			}
		}
	}
	
	
}
