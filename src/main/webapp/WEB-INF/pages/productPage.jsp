<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<html>
<title>Music App</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
  <div class="w3-card-4">
    <header class="w3-container w3-blue">
      <h1>${product.code} - ${product.name }</h1>
    </header>

    <div class="w3-container">
      <p>${product.description }</p>
    </div>

    <footer class="w3-container w3-blue">
      <h5>${product.price }</h5>
    </footer>
  </div>
</div>

</body>