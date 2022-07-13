<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
         <jsp:param name="subtitle" value='<%=URLEncoder.encode(\"mod009 : 회원조회\",\"UTF-8\") %>'/>
      	</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3>회원조회되었습니다.</h3>
		<c:forEach var="user" items="${userList}">
         	유저 uid : ${user.uid}<br>
         	유저 이름 : ${user.userName}<br>
         	유저 아이디 : ${user.userId}<br>
         	유저 비밀번호 : ${user.passwd}<br>
         	<br>
   		</c:forEach>
	</div>
</div>
</body>
</html>