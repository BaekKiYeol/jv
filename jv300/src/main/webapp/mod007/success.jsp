<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<style>
	#header {
		font-size: 40px;
		color: green;
	}
	#footer {
		padding-top: 20px;
	}
</style>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="mod007 : Java Beans and include<br>회원가입 완료"/>
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"\",\"UTF-8\") %>"/>
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3>회원가입되었습니다.</h3>
		<jsp:useBean id="user" class="com.varxyz.jv300.mod007.User" scope="request"/>
		아이디 : <jsp:getProperty property="userId" name="user"/><br>
		이름 : <jsp:getProperty property="userName" name="user"/>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>	
	</div>
</div>

</body>
</html>