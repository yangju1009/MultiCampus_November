<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h3>update성공/실패했는지 결과</h3>
<%
	int result = (int)request.getAttribute("result");
	if(result == 1){
		out.print("<h2>수정 성공!</h2>");
	}else{
		out.print("<h2>수정 실패!</h2>");
	}
%>
<a href="product.jsp">상품목록으로 go!</a>
</body>
</html>