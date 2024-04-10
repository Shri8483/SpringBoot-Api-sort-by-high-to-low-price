<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.model.Product"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Product> pList = (List<Product>) request.getAttribute("data");
	%>

	<h3 class="display-6 text-center">-------------------Product
		Details-------------------</h3>
		
	<div class="container">
	<a href="lowtohigh" class="">Price: low to high</a>
	<div class="row justify-content-center">
		<table border=1 cellspacing=0 cellpadding=10 class="table table-light">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Product Price</th>
			</tr>
			<%
				for (Product product : pList) {
			%>
			<tr>
				<td><%=product.getPid()%></td>
				<td><%=product.getPname()%></td>
				<td><%=product.getPcategory()%></td>
				<td><%=product.getPprice()%></td>
			</tr>

			<%
				}
			%>
		</table>
			<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item"><a class="page-link" href="#">All Data</a></li>
    <li class="page-item"><a class="page-link" href="firstFour">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</nav>
</div>
	</div>
	

</body>
</html>