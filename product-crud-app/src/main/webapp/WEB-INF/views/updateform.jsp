<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Change Product Details</h1>
				<hr>
				<form action="${pageContext.request.contextPath }/handleProduct"
					method="post">

					<div class="form-group">
						<input type="text" class="form-control" id="id"
							aria-describedby="emailHelp" placeholder="Enter Product"
							name="productId" value="${product.productId }" hidden>
					</div>

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							placeholder="Enter Product" name="productName"
							value="${product.productName }">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product
							Description</label>
						<textarea class="form-control" name="productDescription"
							placeholder="Description" id="exampleFormControlTextarea1"
							rows="3">${product.productDescription }</textarea>
					</div>

					<div class="form-group">
						<label for="name">Product Price</label> <input type="number"
							class="form-control" id="price" aria-describedby="emailHelp"
							placeholder="Enter Price" name="productPrice"
							value="${product.productPrice }">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-dark">Back</a>
						<button type="submit" class="btn btn-dark">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>