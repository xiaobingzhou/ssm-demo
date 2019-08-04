<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table >
	<tr>
		<th>id</th>
		<th>lastName</th>
		<th>email</th>
		<th>gender</th>
	</tr>
	<c:forEach var="emp"  items="${emps}">
		<c:choose>
			<c:when test="${emp != null}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.lastName}</td>
					<td>${emp.email}</td>
					<td>${emp.gender}</td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr><td colspan="4">没有数据</td></tr>
			</c:otherwise>
		</c:choose>
		
	</c:forEach>

</table>
</body>
</html>