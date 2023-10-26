package com.demo.controller;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 오라클 데이터베이스 드라이버(ojdbc8.jar)를 이용한 연결 테스트

public class JDBCTests {

	private static final Logger logger = LoggerFactory.getLogger(JDBCTests.class);

	static {
		// JDBC 작업에 사용하는 메서드들이 예외 처리를 하는 특징을 가지고 있다.
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 메모리상에 DriverManager 객체 생성
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 오라클 서버에 연결 테스트하는 메서드
	@Test // JUnit을 이용한 테스트 메서드로 설정한다는 의미
	public void testConnection() {

		long start = System.currentTimeMillis();
		// 연결 작업. 만 번을 테스트하려고 했으나 오라클 데이터베이스 설정 부분으로 인해 테스트 못함.
		// [참고] https://blog.naver.com/PostView.nhn?blogId=deersoul6662&logNo=221812017367
		for (int i = 0; i < 10; i++) {
			// conn 객체를 자동으로 close() 처리를 해줌 -> AutoCloseable
			// AutoCloseable을 상속받는 클래스만 사용 가능 
			try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora_user", "1234")) {
			} catch (Exception ex) {
				fail(ex.getMessage());
			}
		}
		long end = System.currentTimeMillis();

		logger.info("연결속도: " + (start - end));
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
