package ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		//스레드 2개(user1Thread,user2Thread)
		Calculator calculator = new Calculator();//공유객체

		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}
}