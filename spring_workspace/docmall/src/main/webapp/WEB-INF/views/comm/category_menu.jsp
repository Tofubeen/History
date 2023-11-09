<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="category_menu">
	<ul class="nav">
		<c:forEach items="${firstCategoryList }" var="category">
			<li class="nav-item">
				<a class="nav-link active" href="#" data-cg_code="${category.cg_code }">${category.cg_name }</a>
			</li>
		</c:forEach>
	</ul>
</div>

<script>
	// <script>태그는 제외한다.
	$(document).ready(function () {
		//1차카테고리 오버
		$("div#category_menu  li a").on("mouseover", function (e) {
			e.preventDefault();  //a태그의 링크기능을 제거
			console.log("1차카테고리 오버");

			let cg_code = $(this).data("cg_code");

			console.log("1차 카테고리 코드: " + cg_code);

			return;

			let url = '/category/secondCategory/' + cg_code;
			$.getJSON(url, function (category) {

			});
		});
	});
</script>