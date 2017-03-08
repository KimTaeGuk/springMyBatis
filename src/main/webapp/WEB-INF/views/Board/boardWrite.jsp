<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글 쓰기 페이지 입니다.</h1>
<form action="boardWriteProc" method="POST">
<table border="1">
	<tr>
		<td>이름</td>
		<td><input type="text" name="bId" placeholder="이름"></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input type="text" name="bTitle" placeholder="제목"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea name="bContent"></textarea></td>
	</tr>
	<tr>
		<th colspan="2"><input type="submit" value="전송"></th>
	</tr>
</table>
</form>
</body>
</html>