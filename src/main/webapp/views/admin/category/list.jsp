<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh mục sách</title>
</head>
<body>
	<div class="container-fluid">
		<form action="admin-category" id="formSubmit" method="get">
			<a href="" class="btn btn-primary mb-3">Thêm danh mục</a>
			<table class="table table-striped">
				<thead style="color: black;">
					<tr>
						<th scope="col">Mã danh mục</th>
						<th scope="col">Tên danh mục</th>
						<th scope="col">Hành động</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${model.listResult}" var="item">
						<tr>
							<td>${item.id}</td>
							<td>${item.tenDanhMuc}</td>
							<td><a href="" class="btn btn-primary">Sửa</a> <a href="" class="btn btn-danger">Xóa</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<p id="p1"></p>
			<ul class="pagination" id="pagination"></ul>
			<input type="hidden" value="" id="page" name="page"> 
			<input type="hidden" value="" id="maxPageItems" name="maxPageItems">
			<input type="hidden" value="" id="sortName" name="sortName">
			<input type="hidden" value="" id="sortBy" name="sortBy">
		</form>
	</div>
</body>
</html>