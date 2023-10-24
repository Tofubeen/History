package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {

		//작업준비내용
		String[][] mails = new String[1000][3];
		for( int i = 0 ; i<mails.length ; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "user" + i + "@my.com";
			mails[i][2] = "신상품입고";
		}
		
		//1) 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//2)작업생성 및 처리요청(스레드플의 작업큐(Queue)에 등록
		for(int i = 0; i<1000; i++) {
			final int idx = i; // jdk 1.8 에서 부터는 final 생략가능
			//지역변수가 익명객체안에서 사용시 값을 변경이 불가능한 문법규칙이 존재한다.
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "]" + from + "==>" + to + ": " + content);
				}
			});
	}
		//3)스레드플 종료
		executorService.shutdown();
	}
	}

