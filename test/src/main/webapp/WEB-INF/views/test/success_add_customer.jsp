<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success add customer</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<style>
a {
  text-decoration: none;
  color: #111;
}
</style>
<body>
<div class="login-wrap">
  <div class="login-html">
    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">회원가입 성공</label>
    <div class="login-form">
      <div class="sign-up-htm">
        <form action="add_customer" method="post">
        <div class="group">
          <label for="user" class="label">User Id</label>
          	<label>아이디 : </label>${customer.userId}
        </div>
        <div class="group">
          <label for="pass" class="label">Password</label>
          	<label>비밀번호 : </label>${customer.passwd}
        </div>
        <div class="group">
          <label for="pass" class="label">Name</label>
          	<label>이름 : </label>${customer.name}
        </div>
        <div class="group">
          <label for="pass" class="label">Social Security number</label>
          <label>이름 : </label>${customer.ssn}
        </div>
        <div class="group">
          <label for="pass" class="label">Phone Number</label>
          <label>이름 : </label>${customer.phone}
        </div>
        <div class="group">
          <label for="pass" class="label">Email Address</label>
          <label>이름 : </label>${customer.email}
        </div>
        <div class="group">
          <input type="submit" class="button" value="Sign Up">
        </div>
        </form>
        <div class="hr"></div>
      </div>
    </div>
  </div>
</div>
	<label>이름 : </label>${customer.name}<br>
	<label>아이디 : </label>${customer.userId}<br>
	<label>비밀번호 : </label>${customer.passwd}<br>
	<label>주민번호 : </label>${customer.ssn}<br>
	<label>연락처 : </label>${customer.phone}<br>
	<label>E-mail : </label>${customer.email}<br>

	<button class="login_btn"><a href='<c:url value="/test/login"/>'>로그인하기</a></button><br>
	<!-- <button class="find_account_btn"><a href='<c:url value="/test/find_account"/>'>계좌조회</a></button> -->
	
</body>
</html>