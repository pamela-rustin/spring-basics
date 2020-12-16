<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Order Form</title>
	<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/view/styles.css" /> --%>
	<style>
		.error {color: red}	
		body {background-color: honeydew;}
		h1   {color: blue;}
		/* p    {color: darkgreen; font-family: verdana; font-size: 20px;} */	
		p    {color: darkgreen}
		#p1  {color: blue}	
	</style>
</head>
<body>
	<h1>Fill Order Details. Asterisk (*) means required </h1>
	<form:form action="processform" modelAttribute="order">
	<p>Product (*): <form:input path="product"/>
	<small><form:errors path="product" cssStyle="color:red"></form:errors></small>
	<br><br><p>
	Product Code: <form:input path="productCode"/>
	<small><form:errors path="productCode" cssStyle="color:red"></form:errors></small>
	<br><br>
	Quantity: <form:input path="quantity"/>
	<small><form:errors path="quantity" cssStyle="color:red"></form:errors></small>
	<br><br>
	Price: <form:input path="price"/>
	<br><br>
	Address Type:
	<form:select path="addressType">
		<form:option value="Home" label="Home Address"></form:option>
		<form:option value="Office" label="Office Address"></form:option>
	</form:select>
	<br><br>
	Pin Code: <form:input path="pincode"/>
	<small><form:errors path="pincode" cssStyle="color:red"></form:errors></small>
	<br><br>
	Payment Mode:
	<form:select path="paymentType">
		<form:options items="${order.paymentOptions }"/>
	</form:select>	
	<br><br>
	Select Coupons: 
	</p>
	<p id="p1">
	HDFC25<form:radiobutton path="coupon" value="HDFC25"/>
	FIRST15<form:radiobutton path="coupon" value="FIRST15"/>
	DIWALI20<form:radiobutton path="coupon" value="DIWALI20"/>
	</p>
	<p>Gift Options:</p>
	<p id="p1">
	Gift Wrap<form:checkbox path="giftOptions" value="wrap"/>
	Greeting Card<form:checkbox path="giftOptions" value="card"/>
	Ribbon<form:checkbox path="giftOptions" value="ribbon"/>   
	<br><br>
	<form:button>Submit</form:button></p>
	</form:form>
	
</body>
</html>