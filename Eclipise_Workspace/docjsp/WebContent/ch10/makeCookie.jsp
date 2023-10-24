<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//쿠키생성 구문(자바문법 가능)
	Cookie cookie = new Cookie("id","doccomsa"); // id라는 이름으로 쿠키생성
	cookie.setMaxAge(10); //단위는 초..브라우저에 쿠키가 2분간 유지.
	//cookie.setDomain("주소");
	//cookie.setPath("경로");
	response.addCookie(cookie);//response객체에 쿠키를 추가.
	
	out.println("쿠키가 생성됨");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="useCookie.jsp">
	<input type="submit" value="생성된 쿠키확인">
</form>
</body>
</html>