<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="container">
   <h1>All Libraries 🏢</h1>
   <a href="/books">🏠 Home </a>
   <hr />
<%--    ${libsList } --%>
   <hr />
	<c:forEach items="${libsList }" var="lib">
		<ul>
			<li>${lib.name }</li>
			
		</ul>

	</c:forEach>
   <hr />
   
	<form:form action="/libraries" method="post" modelAttribute="library">
		<div class="container">
			<form:errors style="color: red" path="*" />
		</div>
		<p>
			<form:label path="name">name</form:label>
			<form:input path="name" />
		</p>
		<p>
			<form:label path="location">location</form:label>
			<form:input path="location" />
		</p>

		<button>Submit</button>
	</form:form>
</div>
</body>
</html>