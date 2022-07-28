<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find account</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
</head>
<body>

	<h3>계좌 조회</h3>
	<form action="find_account" method="post">
		<label>회원ID </label><input type="text" name="userId" required="required"><br>
		<label>계좌번호 : </label>${account.accountNum}<br>
	   <ul>
      	<c:forEach var="item" items="${accountList}">
         	<li>유저 ID : ${item.accountNum}</li>
         	<li>계좌번호 : ${item.accountNum}</li>
        	<li>계좌종류 : ${item.accountType}</li>
    	  </c:forEach>
	   </ul>
	</form>
	
</body>
</html>