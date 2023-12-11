<%@page import="com.multi.mvc02.BookDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Bootstrap JS (optional) -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
.even-row {
	background-color: #e6e6e6; /* 옅은 회색 배경색 */
}

.odd-row {
	background-color: #ffffff; /* 흰색 배경색 */
}
</style>

</head>
<body style="background-color: #f9f9f9;">
	<div class="container mt-4">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">이 름</th>
					<th scope="col">URL</th>
					<th scope="col">이미지</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<BookDTO> list = (List<BookDTO>) request.getAttribute("list");
				for (int i = 0; i < list.size(); i++) {
					BookDTO bag = list.get(i);
					String rowClass = (i % 2 == 0) ? "even-row" : "odd-row";
				%>
				<tr class="<%=rowClass%>">
					<td><%=bag.getId()%></td>
					<td><%=bag.getName()%></td>
					<td><%=bag.getUrl()%></td>
					<td>
					<img src="resources/img/<%=bag.getImg()%>" width="300" height="200">
					</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>
