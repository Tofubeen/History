package ch06.sec07.exam05;



//생성자 오버로딩(overloading) : 생성자를 여러개 정의하는 의미
//새로운 생성자를 정의하지 않고 , 기존 생성자를 호출하는 예제 this()
public class Car {
	
	//필드선언
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	//매개변수의 개수의 타입의 순서가 다른 경우만 문법이 허용된다

	Car() {} //디폴트 생성자는 다른 생성자선언 때문에 자동생성되지 않으므로, 수동으로 선언함
	
	Car(String model) {
		this(model,"은색", 250); //28라인 생성자 호출
	}
	
	Car(String model, String color) {
		this(model,color, 250);//28라인 생성자 호출
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
