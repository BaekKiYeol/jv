<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Success</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<body>

<div class="login-wrap">
  <div class="login-html">
    <input id="tab-1" type="radio" name="tab" class="sign-up" checked><label for="tab-1" class="tab">회원가입 성공</label>
    <div class="login-form">
      <div class="sign-up-htm">
        <form action="add_customer" method="post">
        <div class="group">
        	<label class="info1">아이디 : </label><span class="info">${customer.userId}</span>
        </div>
        <div class="group">
        	<label class="info2">비밀번호 : </label><span class="info">${customer.passwd}</span>
        </div>
        <div class="group">
        	<label class="info3">이름 : </label><span class="info">${customer.name}</span><br>
        </div>
        <div class="group">
        	<label class="info4">주민번호 : </label><span class="info">${customer.ssn}</span>
        </div>
        <div class="group">
        	<label class="info5">연락처 : </label><span class="info">${customer.phone}</span>
        </div>
        <div class="group">
        	<label class="info6">E-mail : </label><span class="info">${customer.email}</span>
        </div>
        <div class="group">
          <a class="login_btn" href='<c:url value="/test/login"/>'>로그인하기</a><br>
        </div>
        </form>
        <div class="hr"></div>
      </div>
    </div>
  </div>
</div>

</body>
</html>