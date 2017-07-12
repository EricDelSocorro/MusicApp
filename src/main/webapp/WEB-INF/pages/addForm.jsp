<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/addFormCss.css" />">
<title>Add Product</title>
</head>
<body>
<form method="POST">
	<input value="" type="text" placeholder="Enter Product code" name="code"/>
	<input value="" type="text" placeholder="Enter Product name" name="name"/>
	<input value="" type="text" placeholder="Enter Product description" name="description"/>
	<input value="" type="text" placeholder="Enter Product price" name="price"/>
	<input value="" type="text" placeholder="Enter Product message" name="message"/>
	<input value="" type="text" placeholder="Enter Product image" name="image"/>
	<button type="submit">Submit</button>
</form>
<h2>by Arwin Calingasan</h2>
</body>
</html>