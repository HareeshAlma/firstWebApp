<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/firstWebApp/Additem" method="post">
	<table align="center">
	<tr><th colspan="2"><font color="green">*********INPUT THE NEW ITEM DETAILS*******</font></th></tr>
	<tr><td>Barcode: </td><td><input type="text" name="barcode" placeholder="enter unique barcode"></td></tr>
	<tr><td>Name: </td><td><input type="text" name="name" placeholder="Entet name of item"></td></tr>
	<tr><td>Description: </td><td><input type="text" name="description" placeholder="Enter a short description"></td></tr>
	<tr><td>Price: </td><td><input type="text" name="price" placeholder="Enter price(only numbers)"></td></tr>
	<tr><td>Quantity: </td><td><input type="text" name="quantity" placeholder="Enter quantity(only numbers)"></td></tr>
	<tr><td>Discount: </td><td><input type="text" name="discount" placeholder="Enter true or false"></td></tr>
	<tr><td>Discount_percent: </td><td><input type="text" name="discount_percent" placeholder="Enter discount percent(donot inlcude any symbol)"></td></tr>
	
	<tr align="center" bgcolor="grey"><td colspan='2'><input type="submit" value="Insert" ></td></tr>
	
	</table>
	
</form>

</body>
</html>