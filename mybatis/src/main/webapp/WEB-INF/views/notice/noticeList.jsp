<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function CallSort(nid){
	
	
		
		
	}


function CallNotice(n){
	frm.nid.value=n;
	frm.submit();
	
	
}

function CallLook(){
	
	if(document.getElementById("tt").value.length==0){ alert("검색할 내용을 입력하세요");}
	else{
		frml.submit();
	}
	
}


</script>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div align="center">
		<div>
			<table id ="ta" border="1">
				<c:if test="${empty message }">
					<tr>
						<th width="100" onmouseenter='this.style.background="#fcecae";'
							onmouseleave='this.style.background="#ffffff";'
							onclick="CallSort(nid)">글번호</th>
						<th width="150">작성자</th>
						<th width="250">제목</th>
						<th width="150">작성일자</th>
						<th width="100" onmouseenter='this.style.background="#fcecae";'
							onmouseleave='this.style.background="#ffffff";'
							onclick="CallSort(hit)">조회수</th>
					</tr>

					<c:forEach items="${notices }" var="notice">
						<tr onmouseenter='this.style.background="#fcecae";'
							onmouseleave='this.style.background="#ffffff";'
							onclick="CallNotice(${notice.nid})">
							<td align="center">${notice.nid }</td>
							<!-- VO파일에 있는 변수이름과 동일하게  -->
							<td align="center">${notice.name }</td>
							<td align="center">${notice.title }</td>
							<td align="center">${notice.writeDate }</td>
							<td align="center">${notice.hit }</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${!empty message }">
					<tr>
						<th width="100">글번호</th>
						<th width="150">작성자</th>
						<th width="250">제목</th>
						<th width="150">작성일자</th>
						<th width="100">조회수</th>
					</tr>
					<tr>
						<td align="center" colspan="5">${message }</td>
					</tr>
				</c:if>




			</table>

		</div>
		<br>
		<div>

			<form id="frml" action="noticeLook.do" method="post">
				<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button>

				&nbsp;&nbsp;&nbsp; 검색: <select name="chwhat" id="chwhat" form="frml">
					<option value="제목">제목</option>
					<option value="작성자">작성자</option>
				</select> <input type="text" id="tt" name="tt">&nbsp;&nbsp;&nbsp;
				<button type="button" onclick="CallLook()">찾기</button>
			</form>




		</div>
		<div>
			<!-- 숨겨져있는 폼 -->
			<form id="frm" action="noticeSelect.do" method="post">
				<input type="hidden" id="nid" name="nid">
			</form>
			<form id="sfrm" action="" method="post">
			<input type="hidden" id="nid" name="nid">
			</form>
		</div>

	</div>
</body>



</html>