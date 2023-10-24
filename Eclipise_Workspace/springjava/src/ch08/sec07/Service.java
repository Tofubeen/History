package ch08.sec07;

public interface Service {

	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
//		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 종속코드");
//		defaultCommon();
	}
	
	
	//private 메소드 java9 버전에서 지원
//	private void defaultCommon() {
//		System.out.println("defaultCommon 중복코드A");
//		System.out.println("defaultCommon 중복코드B");
//	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
//		staticCommon();
	}
	
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
//		staticCommon();
	}
	
	
	
	//private 메소드 java9 버전에서 지원
//	private void defaultCommon() {
//		System.out.println("defaultCommon 중복코드A");
//		System.out.println("defaultCommon 중복코드B");
//	}
	
	
}
