<html>
<head>

<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome to Product App</h1>
				<hr>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Sr No</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="prod" items="${products }">
							<tr>
								<th scope="row">${prod.productId }</th>
								<td>${prod.productName }</td>
								<td>${prod.productDescription }</td>
								<td class="font-weight-bold">&#x20B9 ${prod.productPrice }


								
								<td><a href="delete/${prod.productId }"><i
										class="far fa-trash-alt text-dark"></i></a> <a
									href="update/${prod.productId }"><i
										class="fas fa-pen-nib text-dark ml-4"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">
					<a href="addproduct" class="btn btn-outline-dark">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>

</html>