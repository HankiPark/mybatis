<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/header.jsp"></jsp:include>

	<div align="center">
		<h1>공지사항 작성</h1>
	</div>
	<div align="center">
		<form id="frm" action="noticeInsert.do" method="post">
		<div>
		<table border="1">
		<tr>
		<th width="100">아이디</th><td width="150"><input type="text" id="id" name="id" value="${member.id }" readonly> </td>
		
		<th width="100">작성자</th><td width="150"><input type="text" id="name" name="name" value="${member.name }" readonly> </td>
		<th width="100">작성일자</th><td width="150"><input type="date" id="writeDate" name="writeDate" readonly > </td>
		</tr>
		<tr>
		<th>제 목</th> <td colspan="5"><input style="width:98%" type="text" id="title" name="title"></td>
		</tr>
		<tr>
		<th>내 용</th> <td colspan="5"><textarea id="content" name="content" rows="10" style="width:98%"></textarea></td>
		</tr>
		
		</table>
		
		
		</div><br>
		<div>
		<input type="submit" value="저 장"> &nbsp; &nbsp;&nbsp;
		<input type="reset" value="리 셋"> &nbsp;&nbsp;&nbsp;
		<input type="button" value="목록으로 돌아가기" onclick="location.href='noticeList.do'">
		
		</div>
		
		
		</form>

	</div>
	<script type="text/javascript">
	document.getElementById('writeDate').valueAsDate= new Date();
	</script>
</body>
</html>