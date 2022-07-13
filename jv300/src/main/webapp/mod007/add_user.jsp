<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<style>
	#header {
		font-size: 40px;
	}
	#footer {
		padding-top: 20px;
	}
</style>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
         <jsp:param name="subtitle" value='<%=URLEncoder.encode(\"mod007 : Java Beans and include<br>회원가입\",\"UTF-8\") %>'/>
      </jsp:include>
	</div>
	<div id="content-wrapper">
		<form action="add_user.do" method="post">
	아이디 : <input type="text" name="userId"/><br>
	비밀번호 : <input type="password" name="passwd"/><br>
	이름 : <input type="text" name="userName"/><br>
	주민번호 : <input type="text" maxlength="6" name="ssn"/><br>
	이메일 : <input type="text" name="email1"/>@
			<select name ="email2">
			<option value="naver.com">naver.com</option>
			<option value="google.com">google.com</option>
			<option value="daum.net">daum.net</option>
			</select><br>
	주소 : <select name ="addr1">
			<option value="seoul">서울</option>
			<option value="daejeon">대전</option>
			<option value="daegu">대구</option>
			<option value="busan">부산</option>
			</select>
	상세주소 : <input type="text" name="addr2">
			<input type="submit" value="확인"><br>
</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>	
	</div>
</div>

</body>
</html>