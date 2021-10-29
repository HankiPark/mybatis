<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><jsp:include page="../home/header.jsp"></jsp:include>
	<div align="center">
	<div><h1>나의 정보</h1>
</div>


<table border="1">
<tr><th width="100">ID</th>
<td width="300" align="center">${member.id }</td> </tr>
<tr><th width="100">password</th>
<td align="center">${member.password }</td></tr>

<tr><th width="100">name</th>
<td align="center">${member.name }</td></tr>
<tr><th width="100">address</th>
<td align="center">${member.address }</td></tr>
<tr><th width="100">tel</th>
<td align="center">${member.tel }</td></tr>
<tr><th width="100">author</th>
<td align="center">${member.author }</td>
</tr>
</table><br>
<input type="button" onclick="location.href='memberUpdateForm.do'" value="정보수정"> &nbsp;&nbsp;&nbsp;
<input type="button" onclick="location.href='memberDelete.do'" value="회원탈퇴"> 
	</div>
</body>
</html>