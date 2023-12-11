<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<img src="resources/img/naver.png" width="500" height="150">
	<h2>북마크 정보검색</h2>
	<form action="one">
		<table>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">서버로 전송</button></td>
			</tr>
		</table>
	</form>
	<hr color="green">

	<h2>북마크 전체검색</h2>
	<form action="list">
	<button>전체 검색 요청</button>
	</form>
	<hr color="green">

	<h2>북마크 추가</h2>
	<form action="insert">
	<table>
		<tr>
			<td>아이디:</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>이름:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>URL:</td>
			<td><input type="text" name="url"></td>
		</tr>
		<tr>
			<td>IMG:</td>
			<td><input type="text" name="img"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">북마크 추가</button></td>
		</tr>
	</table>
	</form>

	<hr color="green">

	<h2>북마크 수정</h2>
	<form action="update">
	<table>
		<tr>
			<td>아이디:</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>이름:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">북마크 수정</button></td>
		</tr>
	</table>
	</form>
</body>
</html>