package ch09;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello") // 매핑 주소
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

    // GET 방식으로 요청 시 동작되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 방식으로 호출됨");
		System.out.println("아이디: " + request.getParameter("userid"));
		System.out.println("비밀번호: " + request.getParameter("passwd"));
		
		// DB 연동 작업 코드 작성
	}

	// POST 방식으로 요청 시 동작되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 방식으로 호출됨");
		System.out.println("아이디: " + request.getParameter("userid"));
		System.out.println("비밀번호: " + request.getParameter("passwd"));
		
		// DB 연동 작업 코드 작성
	}

}
