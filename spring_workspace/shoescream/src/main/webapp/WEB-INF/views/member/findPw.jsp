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
      <h3 class="box-title">비밀번호 찾기</h3>
      </div>
      
      <form role="form" id="joinForm" method="post" action="/member/join">
      <div class="box-body">
      <div class="form-group row">
      
        <label for="mbsp_id" class="col-3">아이디</label>
        <div class="col-9">
          <input type="text" class="form-control" name="mbsp_id" id="mbsp_id" placeholder="아이디 입력...">
        </div>
      </div>
      
      <div class="form-group row">
        <label for="mbsp_email" class="col-3">전자우편</label>
        <div class="col-9">
          <input type="email" class="form-control" name="mbsp_email" id="mbsp_email" placeholder="전자우편입력...">
        </div>
      </div>
              
      </div>
      
      <div class="box-footer">
      <button type="button" class="btn btn-primary" id="checkIdEmail">임시비밀번호발송</button>
      </div>
      </form>
      </div>
   </div>

  <%@include file="/WEB-INF/views/comm/footer.jsp" %>
</div>


<%@include file="/WEB-INF/views/comm/plugIn.jsp" %>
  
<script>
 
  $(document).ready(function() {
    
    let useBtCheck = false; // 아이디 중복체크 사용유무 확인
    
    // document.getElementById("idCheck");
    $("#checkIdEmail").click(function() {
      if($("#mbsp_id").val() || $("#mbsp_email").val() == "") {
        alert("ID 혹은 Email를 입력바랍니다");
        $("#mbsp_id").focus();
        return;
      }


      $.ajax ({
        url:'/member/checkIdEmail',
        type: 'get',
        dataType: 'text',
        data: {
        mbsp_id: $("#mbsp_id").val(),
        mbsp_email: $("#mbsp_email").val()
        },
        success: function(result) {
          if(result == "yes") {
            useIDCheck = true;
            alert("임시비밀번호를 발송합니다");
          }else {
            alert("아이디 이메일이 틀립니다");
            useIDCheck = false;
          }
        }
    });


    if(!useIDCheck) {
        alert("아이디,이메일 확인바랍니다.");
        return;
      }
        })
  



  });
</script>
  </body>
</html>
    