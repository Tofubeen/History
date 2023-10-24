package ch06.sec10.exam01.instance;

//정적(static) 키워드를 클래스의 멤버에 사용시 공유목적으로 사용

//대출 예제

public class Loan {
	//대출상품의 이율은 고정금리이다
	// 대출이 1000개 발생되면 , 이율(iyul)은 고정금리 임에도 불고하고, 이율 3%에 기억장소가 힙영역에 1000개 생성이 되어
	//불필요한 기억장소 낭비가 
	
	//이름,금액, 이율
	String name;
	int price;
	int iyul;

	Loan(String name, int price, int iyul) {
		this.name = name;
		this.price = price;
		this.iyul = iyul;
	}
}
