package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();//부모인터페이스 변수로 형변환 되면 자신의 추상메소드를 구현한 메소드만 호출이 가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); //부모인터페이스 변수로 형변환 되면 자신의 추상메소드를 구현한 메소드만 호출이 가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodC();//부모인터페이스 변수로 형변환 되면 자신의 추상메소드를 구현한 메소드만 호출이 가능
		System.out.println();
	}

}
