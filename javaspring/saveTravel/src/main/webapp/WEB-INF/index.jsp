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
    <title>Save Travels</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class=" container w-50 m-auto">
   <h1>Save Travels</h1>
   <table class="table table-striped">
  <thead>
    <tr>

      <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Actions</th>

    </tr>
  </thead>
  <tbody>
  <c:forEach var="onetravel" items="${travelsList}">
    <tr>
      <td><a href="/travel/${onetravel.id }"><c:out value="${onetravel.expenseName }"/></a></td>
      <td><c:out value="${onetravel.vendor }"/></td>
      <td><c:out value="${onetravel.amount }"/></td>
      <td><a href="/travel/${onetravel.id}/edit">edit</a>| 
   	<form action="/travel/${onetravel.id }" method="post">
   	<input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
   	</form></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<h1>Add an Expense</h1>
<hr />
<form:form action="/travel/new" method="post" modelAttribute="travel">
   <form:errors class="text-danger" path="*"/>
    <p>
        <form:label path="expenseName">Expense Name</form:label>
        <form:input path="expenseName"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:input path="vendor"/>
    </p>

    <p>
        <form:label path="amount">Amount</form:label>
        <form:input type="number" path="amount"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:textarea path="description"/>
    </p>    
    <button>Submit</button>
</form:form>  
</div>
</body>
</html>