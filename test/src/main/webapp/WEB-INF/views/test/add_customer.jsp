<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>

	<h3>회원가입</h3>
	<form action="add_customer" method="post">
		<label>이름 </label><input type="text" name="name" required="required"><br>
		<label>아이디 </label><input type="text" name="userId" required="required"><br>
		<label>비밀번호 </label><input type="password" name="passwd" required="required"><br>
		<label>주민번호 </label><input type="text" name="ssn" required="required" placeholder="ex) 123456-1234567"><br>
		<label>연락처 </label><input type="text" name="phone" required="required" placeholder="ex) 010-0000-0000"><br>
		<label>E-mail </label><input type="email" name="email" required="required"><br>
		<input type="submit" value="회원가입"/>
	</form>
	
</body>
</html>