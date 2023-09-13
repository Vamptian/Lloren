<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>sign In</h1>

<c:choose>
	<c:when test="${msg == null }">
	</c:when>
	<c:otherwise>
	
	<h1>${msg}</h1>
	
	</c:otherwise>

</c:choose>


	
	<form:form modelAttribute="user" Action="signin" method="post">
		<form:input path="username" type="text" placeholder="username" />
		<form:input path="password" type="password" placeholder="password" />
		<form:button type="submit">Submit</form:button>
	</form:form>


</body>
</html>