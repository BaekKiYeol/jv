<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<body>

<div class="login-wrap">
  <div class="login-html">
    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">로그인</label>
    <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">회원가입</label>
    <div class="login-form">
      <div class="sign-in-htm">
      	<form action="login" method="post">
        <div class="group">
          <label for="user" class="label">User Id</label>
          <input id="user" type="text" class="input" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Password</label>
          <input id="pass" type="password" class="input" data-type="password" required="required">
        </div>
        <div class="group">
          <input id="check" type="checkbox" class="check" checked>
          <label for="check"><span class="icon"></span> 로그인 유지</label>
        </div>
        <div class="group">
          <input type="submit" class="button" value="Log In">
        </div>
        </form>
        <div class="hr"></div>
      </div>
      <div class="sign-up-htm">
        <form action="add_customer" method="post">
        <div class="group">
          <label for="user" class="label">User Id</label>
          <input id="user" type="text" class="input" name="userId" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Password</label>
          <input id="pass" type="password" class="input" name="passwd" data-type="password" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Name</label>
          <input id="pass" type="text" class="input" name="name" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Social Security number</label>
          <input id="pass" type="text" class="input" name="ssn" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Phone Number</label>
          <input id="pass" type="text" class="input" name="phone" required="required">
        </div>
        <div class="group">
          <label for="pass" class="label">Email Address</label>
          <input id="pass" type="text" class="input" name="email" required="required">
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

</body>
</html>