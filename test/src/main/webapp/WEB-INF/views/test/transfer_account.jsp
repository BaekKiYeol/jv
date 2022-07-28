<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>transfer</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<body>

	<h3>계좌 이체</h3>
	<form action="find_account" method="post">
		<label>출금액 : </label>${account.balance}<input type="text" name="account" required="required"><br>
		<label>받는 계좌번호 : </label>${account.accountNum}<input type="text" name="transferAccount" required="required"><br>
		<label>받을 사람 : </label><input type="text" name="userId" required="required"><br>
		<label>계좌 비밀번호 : </label>${account.passwd}<input type="text" name="passwd" required="required"><br>
	   <ul>
      	<c:forEach var="item" items="${accountList}">
         	<li>유저 ID : ${item.accountNum}</li>
         	<li>계좌번호 : ${item.accountNum}</li>
        	<li>계좌종류 : ${item.accountType}</li>
    	</c:forEach>
	   </ul>
	</form>
	<button class="add_account_btn"><a href='<c:url value="/test/transfer_account"/>'>송금하기</a></button><br>
</body>
</html>