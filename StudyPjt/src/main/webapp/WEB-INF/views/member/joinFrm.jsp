<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/joinMember.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="memberPw"></td>
			</tr>
			<tr>
				<th>사번</th>
				<td><input type="text" name="employeeNo"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="memberName"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="memberTel"></td>
			</tr>
			<tr>
				<th>휴대폰번호</th>
				<td><input type="text" name="memberPhone"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="memberEmail"></td>
			</tr>
			<tr>
				<th>직급</th>
				<td><input type="text" name="memberPosition"></td>
			</tr>
			<tr>
				<th>가입승인</th>
				<td><input type="text" name="memberPermisstion" value="0"></td>
			</tr>
		</table>
		<button type="submit">회원가입</button>
	</form>
	
	<hr>
	
	<form action="/joinContractorsMember.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="contractorsMemberId"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="contractorsMemberPw"></td>
			</tr>
			<tr>
				<th>소속회사</th>
				<td><input type="text" name="contractorsName"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="contractorsMemberName"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="contractorsMemberTel"></td>
			</tr>
			<tr>
				<th>휴대폰번호</th>
				<td><input type="text" name="contractorsMemberPhone"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="contractorsMemberEmail"></td>
			</tr>
			<tr>
				<th>직급</th>
				<td><input type="text" name="contractorsMemberPosition"></td>
			</tr>
			<tr>
				<th>가입승인</th>
				<td><input type="text" name="contractorsMemberPermisstion" value="0"></td>
			</tr>
		</table>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>