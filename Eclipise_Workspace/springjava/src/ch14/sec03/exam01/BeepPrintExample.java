package ch14.sec03.exam01;

/*
스레드 : 프로그램에서 독립적으로 실행하는 단위
하나의 프로그램은 기본적으로 1개의 스레드를 제공
기본스레드 이름: main스레드

프로그램이 실행을 할때에 jvm이 main 스레드를 동작시키고, main스레드가 담당하는 main()메소드를 실행시킨다

기본스레드(main스레드)하에서 main매소드의 실행순서는 작성된 코드. 즉 위에서 아래로 순차적으로 실행되는 특징이다
스레드나 메소드, 클래스에서 "main"이라는 이름은 별다른 기능이 있는건 아니지만 "java"내에 규칙에 따라서 시작을 할때 진입점을 의미한다
즉. 첫 시작할 작업을 main이 붙은 코드부터 시작한다는 의미
*/

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		//작업1: 띵 소리 효과음 발생
		for(int i=0; i<5; i++) {
			toolkit.beep();
			//0.5초 일시정지하는 기능
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		//작업2: "띵" 문자열 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			//0.5초 일시정지하는 기능
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}