<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success add account</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<style>
a {
  text-decoration: none;
  color: #111;
}
</style>
<body>

	<h3>계좌생성 성공</h3>
	<ul>
	   	<li>유저 ID : ${account.userId}</li>
	   	<li>계좌번호 : ${account.accountNum}</li>
	   	<li>계좌종류 : ${account.accountType}</li>
	   	<li>계좌금액 : ${account.balance}</li>
	</ul>
	<button class="add_account_btn"><a href='<c:url value="/test/transfer_account"/>'>송금하기</a></button><br>
</body>
</html>