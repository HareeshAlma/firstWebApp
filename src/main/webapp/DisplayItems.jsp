<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ah.storedb.Item" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
	<tr><th colspan="5"><font color="green">*********LIST OF ITEM DETAILS*******</font></th></tr>
	<tr>
		<th>Barcode</th>
		<th>Name</th>
		<th>Description</th>
		<th>Price</th>
		<th>Quantity</th>
	</tr>	
<%
     ArrayList<Item> items =(ArrayList<Item>)request.getAttribute("itemslist");
	ArrayList<Item> items1 =(ArrayList<Item>)request.getSession().getAttribute("itemslist");

	for(Item item: items1)
	{
	%><tr>
	<td><%= item.getBarcode()%></td>
	<td><%= item.getName()%></td>
	<td><%= item.getDescription()%></td>
	<td><%= item.getPrice()%></td>
	<td><%= item.getQuantity()%></td>
	</tr>
	<% }
	%>
	

</table>
</body>
</html>