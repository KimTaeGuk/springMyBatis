<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>뷰 페이지입니다.</h1>
<table border="1">
	<tr>
		<td>번호</td>
		<td>${BoardView.bNum }</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${BoardView.bId }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${BoardView.bTitle }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>${BoardView.bContent }</td>
	</tr>
	<tr>
		<td>날짜</td>
		<td>${BoardView.bDate }</td>
	</tr>
</table>
</body>
</html>