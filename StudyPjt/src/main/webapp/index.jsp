<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/memberLogin.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memberPw"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">로그인</button></td>
			</tr>
		</table>
	</form>

	<hr>

	<form action="/constractorsMemberLogin.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memberPw"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">로그인</button></td>
			</tr>
		</table>
	</form>
	<a href="/joinFrm.do">회원가입</a><br>
	<!-- <a href="#">아이디</a> / <a href="#">비밀번호</a> 찾기 -->
	
	<a href="/insertConstractorsFrm.do">협력업체 등록</a><br>
	
</body>
</html>