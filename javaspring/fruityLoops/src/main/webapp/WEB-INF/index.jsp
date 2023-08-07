<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table table-striped w-50 m-auto ">
  <thead>
    <tr>

      <th scope="col">Name</th>
      <th scope="col">Price</th>

    </tr>
  </thead>
  <tbody>
  <c:forEach var="oneFruit" items="${fruits}">
    <tr>
      <td><c:out value="${oneFruit.name }"/></td>
      <td><c:out value="${oneFruit.price }"/></td>
    </tr>
    </c:forEach>
  </tbody>
</table>




<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>