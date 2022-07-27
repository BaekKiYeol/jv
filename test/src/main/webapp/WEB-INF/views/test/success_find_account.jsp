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

	<h3>계좌 조회 성공</h3>
	<label>E-mail : </label>${customerCommand.email}<br>
	<label>이름 : </label>${customerCommand.name}<br>
	<label>계좌번호 : </label>${accountCommand.accountNum}<br>
</body>
</html>