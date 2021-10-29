<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function CallValidation(){
	
	var pw= frm.password.value;
	var pw1= frm.password1.value;
	if(frm.name.value==""){alert("이름을 입력하세요");frm.name.focus(); return false;}
	
	
	if(pw==pw1){
		frm.submit();
	}else{
		alert("패스워드가 일치하지 않습니다.");
		frm.password.value="";
		frm.password1.value="";
		frm.password.focus();
		return false;
	}
	
}

</script>
</head><jsp:include page="../home/header.jsp"></jsp:include>
<body>


<div align="center">
<div><h1>회 원 가 입</h1></div>
<form id="frm" name="frm" action="memberJoin.do" method="post">
<table border="1">
<tr><th width="150">ID</th><td  width="200"><input type="text" id="id" name="id" required="required" ></td>
</tr>
<tr><th>Password</th><td  width="200"><input type="password" id="password" name="password" required="required" ></td>
</tr>

<tr><th>Password재입력</th><td  width="200"><input type="password" id="password1" name="password1" required="required" ></td>
</tr>
<tr><th>Name</th><td  width="200"><input type="text" id="name" name="name"></td>
</tr>
<tr><th>Address</th><td  width="200"><input type="text" id="address" name="address"  ></td>
</tr>
<tr><th>Tel</th><td  width="200"><input type="text" id="tel" name="tel"  ></td>
</tr>

</table><br>
<input type="hidden" id="author" name="author" value="USER">
<input type="button" value="회원가입" onclick="CallValidation()"> &nbsp;&nbsp;&nbsp;
<input type="reset"  value="초 기 화">


</form>

</div>
</body>
</html>