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
    <title>Burger Tracker</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class=" container w-50 m-auto">
   <h1>Burger Tracker</h1>
   <table class="table table-striped">
  <thead>
    <tr>

      <th scope="col">Burger Name</th>
      <th scope="col">Restaurant Name</th>
      <th scope="col">Rating (out of 5)</th>
      <th scope="col">Action</th>

    </tr>
  </thead>
  <tbody>
  <c:forEach var="oneBurger" items="${burgersList}">
    <tr>
      <td><c:out value="${oneBurger.burgerName }"/></td>
      <td><c:out value="${oneBurger.restaurantName }"/></td>
      <td><c:out value="${oneBurger.rating }"/></td>
      <td><a href="/burger/${oneBurger.id}/edit">edit</a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<h1>Add a Burger</h1>
<hr />
<form:form action="/burger/new" method="post" modelAttribute="burger">
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
</div>
</body>
</html>

