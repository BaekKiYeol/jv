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
      width: 100%;
      position: absolute;
      top: 0;
      text-align: center;
      background-color: #f1f1f1;
      font-size: 40px;
      color: green;
   }
   
   #content-wrapper {
      text-align: center;
      margin: 300px 80px;
      font-size: 20px;
   }
   
   #footer {
      width: 100%;
      position: absolute;
      bottom: 0;
      padding: 30px 0;
      text-align: center;
      font-size: 34px;
      background-color: #f1f1f1;
      margin: 0 auto;
   }
</style>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
         <jsp:param name="subtitle" value='<%=URLEncoder.encode(\"mod009 : 회원가입 및 조회\",\"UTF-8\") %>'/>
      	</jsp:include>
	</div>
	<div id="content-wrapper">
		<form action="add_user.do" method="post">
	이름 : <input type="text" name="userName"/><br>
	아이디 : <input type="text" name="userId"/><br>
	비밀번호 : <input type="password" name="passwd"/><br>
	주민번호 : <input type="text" maxlength="6" name="ssn"/><br>
	이메일 : <input type="text" name="email1"/> @
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
	상세주소 : <input type="text" name="addr2"><br>
			<input type="submit" value="회원가입"><br>
</form>

<form action="find_user.do" method="post">
			<input type="submit" value="회원조회"><br>
</form>

	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>	
	</div>
</div>

</body>
</html>