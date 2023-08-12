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
    <title>burger edit</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Edit a Burger</h1>
   <a href="/">Home</a>
<hr />
<form:form action="/burger/${burger.id}/edit" method="post" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
   <form:errors class="text-danger" path="*"/>
    <p>
        <form:label path="burgerName">Burger Name</form:label>
        <form:input path="burgerName"/>
    </p>
    <p>
        <form:label path="restaurantName">Restaurant Name</form:label>
        <form:input path="restaurantName"/>
    </p>

    <p>
        <form:label path="rating">rating</form:label>
        <form:input type="number" path="rating"/>
    </p>
    <p>
        <form:label path="notes">notes</form:label>
        <form:textarea path="notes"/>
    </p>    
    <button>Submit</button>
</form:form> 
</body>
</html>

