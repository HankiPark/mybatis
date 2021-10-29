<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><jsp:include page="../home/header.jsp"></jsp:include>
<div align="center">
	<div><h1> 로 그 인 </h1></div>
<form id="frm" name="frm" action="memberLogin.do" method="post">
<table border="1">
<tr><th width="100">아이디</th><td width="300"><input type="text" id="id" name="id" required="required"></td>
</tr>
<tr><th width="100">패스워드</th><td width="300"><input type="password" id="password" name="password" required="required"></td>
</tr>




</table><br>

<input type="submit" value="로그인">

</form>

</div>

</body>
</html>