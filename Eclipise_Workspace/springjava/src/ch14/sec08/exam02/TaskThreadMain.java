package ch14.sec08.exam02;

//우선 순위설정은 단지 추천순위정도이다
//우선순위를 높게 설정한다고 해서 항상 먼저 실행되는 것을 보장하는 것은 아니다
public class TaskThreadMain {

	public static void main(String[] args) {
		Tesk1 tesk1 = new Tesk1();
		tesk1.start();
		
		
		Task2 task2 = new Task2();
		Thread threadTask2 = new Thread(task2);
		
		threadTask2.start();
		
		for(int i = 301; i<=399; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println("작업3 종료");
	}
		
		
		
		
	}


