package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

//public: 패키지와 상관없이 접근가능
//[default] : 같은 패키지 접근
//private : 클래스안에서만 접근

public class C {
	//필드선언
//	A a1 = new A(true); //생성자는 다른 패키지이지만, public이므로 접근가능
			
//	A a2 = new A(1); // 생성자는 다른 패키지이지만 , default 로 되어있어 접근 불가능
//	A a3 = new A("문자열"); // 생성자는 다른패키지이지만 , private 로 되어있어 접근불가능
}
