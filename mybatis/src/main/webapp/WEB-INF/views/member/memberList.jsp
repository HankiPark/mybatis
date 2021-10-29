<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><jsp:include page="../home/header.jsp"></jsp:include>
	<div align="center">
		<div>
			<table border="1">
				<tr>
					<th width="100">id</th>
					<th width="100">password</th>
					<th width="100">이름</th>
					<th width="300">주소</th>
					<th width="200">전화번호</th>
					<th width="100">권한</th>
				</tr>
				<c:forEach items="${members }" var="member">
					<tr>
						<td>${member.id}</td>
						<td>${member.password}</td>
						<td>${member.name}</td>
						<td>${member.address}</td>
						<td>${member.tel}</td>
						<td>${member.author}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>