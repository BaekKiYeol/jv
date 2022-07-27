<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<style>
a {
  text-decoration: none;
  color: #111;
}
</style>
<body>

	<h3>회원가입 성공</h3>
	<label>이름 : </label>${customer.name}<br>
	<label>아이디 : </label>${customer.userId}<br>
	<label>비밀번호 : </label>${customer.passwd}<br>
	<label>주민번호 : </label>${customer.ssn}<br>
	<label>연락처 : </label>${customer.phone}<br>
	<label>E-mail : </label>${customer.email}<br>

	<button class="login_btn"><a href='<c:url value="/test/add_account"/>'>계좌추가</a></button>
	
</body>
</html>