package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		// 스레드풀 생성 , 5개 스레드 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// 작업생성 : 작업클래스

		// 처리요청 ; 직접 작성된 객체를 스레드 풀의 Que(큐) 에 등록하는 작업

		// 스레드풀 종료
		// 스레드 풀의 현재 작업 또는 QUE 에 등록된 작업을 진행하지 않고 , 스레드플 종료
		// 현재 작업을 유실, QUE에 등록된 진행하지 않는 작업은 나중에 리턴 받을 수 있다
		executorService.shutdownNow();

		// 스레드플에 존재하는 모든 작업이 완료 된 이후에 스레드 플이 종료된다
//		executorService.shutdownNow();

	}

}
