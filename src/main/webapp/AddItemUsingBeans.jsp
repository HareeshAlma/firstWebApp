<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="id1" class="com.ah.storedb.Item" scope="application"></jsp:useBean>
<jsp:setProperty  name="id1" property="*"/>
<center>
New item has been added! And the details are below
<table border="1">
<tr>

<br>
<td><jsp:getProperty name="id1" property="barcode" /></td>
<td><jsp:getProperty name="id1" property="name" /></td>
<td><jsp:getProperty name="id1" property="description" /></td>
<td><jsp:getProperty name="id1" property="price" /></td>
<td><jsp:getProperty name="id1" property="quantity" /></td>

</tr>
</table>
</center>
</body>
</html>