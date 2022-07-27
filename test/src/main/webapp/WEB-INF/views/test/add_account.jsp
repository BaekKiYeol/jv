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

	<h3>계좌생성</h3>
	<form action="add_account" method="post">
		<label>회원ID </label><input type="text" name="userId" required="required"><br>
		<label>계좌 </label>
		<select name = "banking">
			<option value="농협">농협</option>
			<option value="농협">신한</option>
			<option value="농협">대구</option>
			<option value="농협">우리</option>
			<option value="농협">기업</option>
		</select>
		<input type="text" name="accountNum" required="required">
		<select name = "accountType">
			<option value="S">Saving</option>
			<option value="C">Checking</option>
		</select><br>
		
		<input type="submit" value="계좌생성"/>
	</form>
	
</body>
</html>