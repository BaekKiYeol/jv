<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>

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
			<input type="submit" value="확인">
</form>
</body>
</html>