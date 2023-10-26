<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="en" class="h-100">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.101.0">
    <title>Sticky Footer Navbar Template · Bootstrap v4.6</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.6/examples/sticky-footer-navbar/">

   
    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <!-- Favicons -->

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="/resources/sticky-footer-navbar.css" rel="stylesheet">
</head>
<body class="d-flex flex-column h-100">
    
	<header>
	  <!-- Fixed navbar -->
	  <%@include file="/WEB-INF/views/comm/header.jsp" %>
	</header>

	<!-- Begin page content -->
	<main role="main" class="flex-shrink-0">
	  <div class="container">
	   	<section>
	   		<div class="row"> <!-- 합이 12까지 사용 가능. 반드시 고정될 필요는 없음 -->
	   			<!-- <div class="col-해상도-숫자"></div>  -->
	   			<div class="col-md-12">
		   			<div class="box box-primary">
						<div class="box-header with-border">
							<h3 class="box-title mt-5">Get</h3>
						</div>
					
						<div class="box-body">
							<div class="form-group">
								<label for="bno">Bno</label>
								<input type="text" class="form-control" name="bno" id="bno" value="${board.bno}" readonly>
							</div>
							<div class="form-group">
								<label for="title">Title</label>
								<!-- readonly="readonly"와 같이 속성명과 값이 같은 경우 값을 생략할 수 있다. -->
								<input type="text" class="form-control" name="title" id="title" value="${board.title}" readonly>
							</div>
							<div class="form-group">
								<label for="writer">Writer</label>
								<input type="text" class="form-control" name="writer" id="writer" value="${board.writer}" readonly>
							</div>
							<div class="form-group">
								<label>Content</label>
								<!-- input 태그는 value 속성이 있지만, textarea 태그는 없음 -->
								<textarea class="form-control" rows="3" name="content" readonly>${board.content}</textarea>
							</div>
							<div class="form-group">
								<label for="regdate">Regdate</label>
								<input type="text" class="form-control" name="regdate" id="regdate" value='<fmt:formatDate value="${board.regdate}" pattern="yyyy/MM/dd" />' readonly>
							</div>
							<div class="form-group">
								<label for="updateddate">Updateddate</label>
								<input type="text" class="form-control" name="updateddate" id="updateddate" value='<fmt:formatDate value="${board.updateddate}" pattern="yyyy/MM/dd" />' readonly>
							</div>
							
						</div>
		
						<div class="box-footer">
							<!-- BoardController의 @ModelAttribute("cri") Criteria cri -->
							<!-- Modify, Delete, List 버튼 클릭 시 아래 form 태그를 전송-->
							<form id="curListInfo" action="" method="get">
								<input type="hidden" name="pageNum" id="pageNum" value="${cri.pageNum}" />
								<input type="hidden" name="amount" id="amount" value="${cri.amount}" />
								<input type="hidden" name="type" id="type" value="${cri.type}" />
								<input type="hidden" name="keyword" id="keyword" value="${cri.keyword}" />
								<input type="hidden" name="bno" id="bno" value="${board.bno}" />
							</form>
							<button type="button" id="btn_modify" class="btn btn-primary">Modify</button>
							<button type="button" id="btn_delete" class="btn btn-primary">Delete</button>
							<button type="button" id="btn_list" class="btn btn-primary">List</button>
						</div>
						
					</div>	
	   			</div>
	   		</div>
	   	</section>
	  </div>
	</main>

	<footer class="footer mt-auto py-3">
		<%@include file="/WEB-INF/views/comm/footer.jsp" %>
	</footer>
	
		<%@include file="/WEB-INF/views/comm/plug-in.jsp" %>
	
	<script>

		// <form id="curListInfo" action="" method="get">를 참조
		let curListInfo = document.getElementById("curListInfo");

		// 수정 버튼 클릭
		// document.getElementById("btn_modify").addEventListener("click", 함수명);
		document.getElementById("btn_modify").addEventListener("click", fn_modify);

		function fn_modify() {
			// alert('수정');

			// location.href = "/board/modify?bno=${board.bno}"; // location.href = "URL 매핑 주소";
			curListInfo.setAttribute("action", "/board/modify"); // /board/list -> /board/get 전송
			curListInfo.submit(); 
		}

		// 삭제 버튼 클릭
		document.getElementById("btn_delete").addEventListener("click", fn_delete); // 괄호는 제외

		function fn_delete() {

			if(!confirm("삭제를 하시겠습니까?")) return;
			// 페이지(주소) 이동
			// location.href = "/board/delete?bno=${board.bno}";
			curListInfo.setAttribute("action", "/board/delete"); // /board/list -> /board/get 전송
			curListInfo.submit(); 
		}

		// 리스트 클릭
		document.getElementById("btn_list").addEventListener("click", fn_list); // 괄호는 제외

			function fn_list() {

				curListInfo.setAttribute("action", "/board/list"); // /board/list -> /board/get 전송
				curListInfo.submit(); 
			}
	</script>
</body>
</html>
