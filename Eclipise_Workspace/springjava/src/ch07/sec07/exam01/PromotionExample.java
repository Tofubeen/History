package ch07.sec07.exam01;

class A {} //A.class

class B extends A{} // B.class

class C extends A{} // C.class

class D extends B{} // D.class

class E extends C{} // E.class

public class PromotionExample {

	
	
	
	//jvm 소속
	public static void main(String[] args) {
		B b = new B(); // B->A
		C c = new C(); // C->A
		D d = new D(); // D->B->A
		E e = new E(); // E->C->A
		
		A a1 = b; //b라는 객체에 부모는 A클래스이므로 A클래스에 객체 a와 자동형변환이 이루어진다
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		
		//형변환 에러발생
//		B b3 = e; //상속이 직계가 아니므로 형변환 지원 안함
		
		
	
	}

}
