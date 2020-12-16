<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmation</title>
<style>
	body {background-color: honeydew;}
	h1   {color: blue;}
	p    {color: green;}
}
</style>
</head>
<body>
	
	<h1> Confirmed!! </h1>
	
	<p>Product: ${order.product }
	<br>
	<p>Product Code: ${order.productCode }
	<br>
	<p>Quantity: ${order.quantity }
	<br>
	<p>Price: ${order.price }
	<br>
	<p>Payment Mode: ${order.paymentType }
	<br>
	<p>Address Type: ${order.addressType }
	<br>
	<p>Pin Code : ${order.pincode } 
	<br>
	<p>Coupon : ${order.coupon }
	<br>
	<p>Gift Options : 
	<!-- Unordered list -->
	<ul>
		<c:forEach var="temp" items="${order.giftOptions }">
			<li><p>${temp }</li>
		</c:forEach>
	</ul>
</body>
</html>