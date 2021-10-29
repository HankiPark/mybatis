<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function CallEdit(str){
	if(str=='E'){
		var tit= document.getElementById("ctitle");
		var txt= document.getElementById("textarea");
		frm.title.value=tit.value;
		frm.content.value=txt.value;
		frm.action = "noticeEdit.do";
	}else{
		frm.action ="noticeDelete.do";
	}
	frm.submit();
}


</script>
</head>
<body><jsp:include page="../home/header.jsp"></jsp:include>
<div align="center">
<div>
<h1>공지사항</h1>
</div>
<div>
<table  border="1">
<tr align="center">
<th width="100">글번호</th><td width="100">${notice.nid }</td>
<th width="150">작성자</th><td width="150">${notice.name }</td>
<th width="150">작성일자</th><td width="150">${notice.writeDate }</td>
<th width="100">조회수</th><td width="100">${notice.hit }</td>
</tr>
<tr >
<th align="center" width="150">제목</th><td colspan="7"><input type="text" id ="ctitle" name="ctitle" style="width:99%" value="${notice.title }"></td>
</tr>
<tr>
<th align="center" width="150">내용</th><td colspan="7"><textarea id ="textarea" name ="textarea" style="width:99%; font-size: 20px " rows="10">${notice.content }</textarea></td>
</tr> 
</table>
</div><br>

<div>
<button style="width:70px; height:40px; font-size:15px" type="button" onclick="location.href='noticeList.do'">목록</button> &nbsp;&nbsp;&nbsp;
<c:if test="${member.author eq 'ADMIN' || member.id eq notice.id }">
<button style="width:70px; height:40px; font-size:15px" type="button" onclick="CallEdit('E')">수정</button> &nbsp;&nbsp;&nbsp;
<button style="width:70px; height:40px; font-size:15px" type="button" onclick="CallEdit('D')">삭제</button>
</c:if>
</div>
<div>
<form id="frm" action="" method="post"><input type="hidden" id="nid" name="nid" value="${notice.nid }">
<input type="hidden" id="title" name="title" ><input type="hidden" id="content" name="content" >
</form>
</div>

</div>

</body>
</html>