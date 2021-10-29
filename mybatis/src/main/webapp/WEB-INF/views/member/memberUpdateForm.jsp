<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../home/header.jsp"></jsp:include>
<body>
	<div align="center">
		<div>
			<h1>나의 정보</h1>
		</div>

		<form id="frm" name="frm" action="memberUpdate.do" method="post">
			<table border="1">
				<tr>
					<th width="100">ID</th>
					<td width="300" align="center">${member.id }</td>
				</tr>
				<tr>
					<th width="100">password</th>
					<td align="center"><input type="text" id="password" name="password" style="align:center; width:98%" value="${member.password }"></td>
				</tr>
				<tr>
					<th width="100">name</th>
					<td align="center">${member.name }</td>
				</tr>
				<tr>
					<th width="100">address</th>
					<td align="center">${member.address }</td>
				</tr>
				<tr>
					<th width="100">tel</th>
					<td align="center">${member.tel }</td>
				</tr>
				<tr>
					<th width="100">author</th>
					<td align="center"><input type="text" id="author" name="author" style="align:center; width:98%" value="${member.author }"></td>
				</tr>
			</table>
			<br> <input type="submit"
				 value="정보변경">
			&nbsp;&nbsp;&nbsp; <input type="reset"
				 value="취소">
		</form>
	</div>
	</body>
</html>