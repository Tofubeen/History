package ch06.sec10.exam01.instance;

public class LoanExample {

	public static void main(String[] args) {
		//홍길동 대출
		
		Loan loan1 = new Loan("홍길동", 5000, 3);
		
		Loan loan2 = new Loan("손흥민", 3000, 3);
		
		Loan loan3 = new Loan("이강인", 8000, 3);
		
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
		
		//고정금리 이지만 , 코로나로 인아여, 금융정책 변화발생 3% -> 5%
		
		loan1.iyul = 5;
		loan2.iyul = 5;
		loan3.iyul = 5;
		
		System.out.println("------------------이용이 3% -> 5%로 변경-----------------------------");
		
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
		System.out.printf("%s 홍길동 대출 정보는? %d 원이고, %d 이율입니다.\n ", loan1.name, loan1.price, loan1.iyul);
	}

}
