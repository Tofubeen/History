package ch11.sec06;

public class AcCountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기 
		try {
			account.withdraw(30000); //예외 떠넘기기 기능이 포함
		} catch (InsufficientException e) {
			String message = e.getMessage(); //잔고부족: 20000 모자람
			System.out.println(message);
		}

	}

}
