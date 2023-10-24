package ch11.sec06;

public class Account {
	
	private long balance;
	
	public Account() {}
	
	//잔고상태
	public long getBalance() {
		return balance;
	}
	
	//예끔
	public void deposit(int money) {
		balance += money;
	}
	
	//인출
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			//예외를 코드로 발생시키는 구문
			throw new InsufficientException("잔고부족: " + (money-balance) + "모자람"); 
			}
		balance -= money;
		}
	}

