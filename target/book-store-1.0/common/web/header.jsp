<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">My Book Store</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Trang chủ
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Giới thiệu</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Dịch vụ</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Liên hệ</a></li>
				<c:if test="${not empty USERMODEL}">
					<li class="nav-item"><a class="nav-link">Chào mừng, ${USERMODEL.hoTen}</a></li>
					<li class="nav-item"><a class="nav-link" href="logout?action=logout">Đăng xuất</a></li>
				</c:if>				
				<c:if test="${empty USERMODEL}">
					<li class="nav-item"><a class="nav-link" href="login?action=login">Đăng nhập</a></li>
				</c:if>
				
			</ul>
		</div>
	</div>
</nav>