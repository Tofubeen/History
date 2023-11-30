<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.101.0">
    <title>Pricing example · Bootstrap v4.6</title>

    <!-- Bootstrap core CSS -->
<%@include file="/WEB-INF/views/comm/plugIn2.jsp" %>



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

    

  </head>
  <body>
    
<%@include file="/WEB-INF/views/comm/header.jsp" %>

<div class="container">
   <div class="text-center">
    <div class="box box-primary">
      <div class="box-header with-border">
      <h3 class="box-title">아이디찾기</h3>
      </div>
      
      <form role="form" id="joinForm" method="post" action="/member/findId">
      <div class="box-body">
      <div class="form-group row">
        <label for="mbsp_name" class="col-2">이름</label>
        <div class="col-10">
          <input type="text" class="form-control" name="mbsp_name" id="mbsp_name" placeholder="이름입력...">
        </div>
      </div>
      <div class="form-group row">
        <label for="mbsp_email" class="col-2">이메일</label>
        <div class="col-8">
          <input type="email" class="form-control" name="mbsp_email" id="mbsp_email" placeholder="전자우편입력...">
        </div>
      </div>
          
      </div>
      
      <div class="box-footer">
      <button type="button" class="btn btn-primary" id="btnIdCheck">아이디 확인</button>
      </div>
      </form>
      </div>
   </div>

  <%@include file="/WEB-INF/views/comm/footer.jsp" %>
</div>

<%@include file="/WEB-INF/views/comm/plugIn.jsp" %>
  
<script>                                                   
  $(document).ready(function() {
  
      $("#btnIdCheck").click(function() {
        console.log("이름 " + $("#mbsp_name").val()  );
        console.log("이메일 " + $("#mbsp_email").val()  );

        if($("#mbsp_name").val() == "" || $("#mbsp_email").val() == "" ) {
          alert("이름 혹은 이메일 항목을 확인 해주세요.")
          return;
        }

              //찾은 아이디 전송
              

      $.ajax({
        url : '/member/findIdCheck',
        type: 'get',
        dataType: 'text',
        data: {mbsp_name : $('#mbsp_name').val(),
              mbsp_email : $("#mbsp_email").val()
        },
        success: function(result) {
          if(!result == '') {
            alert("귀하의 아이디는 " + result + "입니다");
            location.href = "/member/login";
          }else{
            alert("정보와 일치하는 아이디가 없습니다");
          }
        }
      });

        
        });






  });
</script>
  </body>
</html>