<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- %@디렉티브 태그, %!멤버 변수 또는 메소드 태그 --%>
<%!
	private static final String DEFAULT_NAME = "World"; 
	public void jspInit(){
		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
<%-- 이것은 JSP 주석 --%>
<%-- 그냥 %는 자바 코드 입력 --%>
<%
	String name = request.getParameter("userName");
	if(name == null || name.length() == 0){
		name = DEFAULT_NAME;
	}
%>
<h3>Hello, <%=name %></h3>
</body>
</html>