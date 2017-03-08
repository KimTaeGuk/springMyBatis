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
<h1>리스트 페이지입니다.</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>날짜</th>
	</tr>
	<c:forEach items="${BoardList }" var="BoardList">
		<tr>
			<td>${BoardList.bNum }</td>
			<td>${BoardList.bId }</td>
			<td><a href="<c:url value='boardView?bNum=${BoardList.bNum }'/>">${BoardList.bTitle }</a></td>
			<td>${BoardList.bDate }</td>
		</tr>	
		<tr>
			<td colaspan="4"></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="4"><a href="boardWrite">글 작성</a></td>
	</tr>
</table>
</body>
</html>